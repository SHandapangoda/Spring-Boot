package com.example.springboot.service;
import com.example.springboot.model.Inventory;
import com.example.springboot.repository.inventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class inventoryServiceImpl implements inventoryService{

    @Autowired
    private inventoryRepository inventoryRepository;

    @Override
    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }
}
