package com.djhoyos.facturacion.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djhoyos.facturacion.com.models.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
