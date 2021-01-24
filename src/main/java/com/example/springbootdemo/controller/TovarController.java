package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.Tovar;
import com.example.springbootdemo.service.TovarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TovarController {

    private final TovarService tovarService;
    @Autowired
    public TovarController(TovarService tovarService) {
        this.tovarService = tovarService;
    }

    @GetMapping("/tovar")
    public String findAll(Model model){
        List<Tovar> tovar = tovarService.findAll();
        model.addAttribute("tovar", tovar);
        return "tovar-list";
    }
    @GetMapping("/tovar-create")
    public String createTovarForm(Tovar tovar){
        return "tovar-create";
    }
    @PostMapping("/tovar-create")
    public String createTovar(Tovar tovar){
        tovarService.saveTovar(tovar);
        return "redirect:/tovar";
    }

    @GetMapping("/tovar-delete/{id}")
    public String deleteTovar(@PathVariable("id") Long id){
        tovarService.deleteById(id);
       return "redirect:/tovar";
    }
    @GetMapping("/tovar-update/{id}")
    public String updateTovarForm(@PathVariable("id") Long id, Model model){
        Tovar tovar = tovarService.findById(id);
        model.addAttribute("tovar", tovar);
     return "tovar update";
    }

    @PostMapping("/tovar update")
    public String updateTovar(Tovar tovar){
        tovarService.saveTovar(tovar);
        return "redirect:/tovar";
    }
}
