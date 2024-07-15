package com.example.controller;


import com.example.model.Entry;
import com.example.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EntryController {

    @Autowired
    private EntryRepository entryRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("entries", entryRepository.findAll());
        return "index";
    }

    @PostMapping("/submit")
    public String submit(@RequestParam String name, @RequestParam String entry) {
        Entry newEntry = new Entry();
        newEntry.setName(name);
        newEntry.setEntry(entry);
        entryRepository.save(newEntry);
        return "redirect:/";
    }
}