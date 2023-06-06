/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tap.m5b.proyectousuario.repository;

import com.tap.m5b.proyectousuario.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jhudy
 */
public interface RolRepository extends JpaRepository<Rol, Integer>{
       @Query(value = "Select * from rol r where r.tipo = :tipo", nativeQuery = true)
    public Rol buscarRol(String tipo);
    
}
