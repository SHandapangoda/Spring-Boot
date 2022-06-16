package com.example.springboot.controller;


import com.example.springboot.service.inventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.springboot.model.Inventory;

@Controller
public class inventoryController {

    @Autowired
    private inventoryService InventoryService;

    @GetMapping("/")
    public String viewHome(Model model){
        model.addAttribute("listInventory",InventoryService.getAllInventory());
        return "index";
    }
}
