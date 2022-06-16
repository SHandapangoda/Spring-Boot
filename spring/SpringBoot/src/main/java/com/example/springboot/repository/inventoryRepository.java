package com.example.springboot.repository;

import com.example.springboot.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface inventoryRepository extends JpaRepository<Inventory,Integer> {

}

