/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tap.m5b.proyectousuario.repository;

import com.tap.m5b.proyectousuario.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jhudy
 */

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

  
}
