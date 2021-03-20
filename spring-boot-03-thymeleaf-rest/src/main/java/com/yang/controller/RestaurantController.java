package com.yang.controller;

import com.yang.bean.Guest;
import com.yang.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @RequestMapping("/guest")
 * 放在类上面代表里面的方法以此开头
 */

@Controller
@RequestMapping("/guest")
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @GetMapping
    public String index(Model model){
        model.addAttribute("guests",service.query());
        return "/thymeleaf/index";
    }

    @GetMapping("/add")
    public String add(){
        return "/thymeleaf/add";
    }

    @PostMapping("/toadd")
    public String toAdd(Guest guest){
        service.add(guest);
        return "redirect:/guest";
    }

    @GetMapping("/toupdate/{guestName}")
    public String toUpdate(@PathVariable("guestName") String guestName,Model model){
        Guest guest = service.select(guestName);
        model.addAttribute("guest",guest);
        return "/thymeleaf/update";
    }
    @PutMapping("/update")
    public String update(Guest guest){
        service.update(guest);
        return "redirect:/guest";
    }
    @DeleteMapping("/{guestName}")
    public String delete(@PathVariable("guestName") String guestName){
        service.delete(guestName);
        return "redirect:/guest/";
    }
}
