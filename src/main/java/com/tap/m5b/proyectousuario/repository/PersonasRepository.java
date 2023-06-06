/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tap.m5b.proyectousuario.repository;

import com.tap.m5b.proyectousuario.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author jhudy
 */
public interface PersonasRepository extends JpaRepository<Persona, Integer> {

    @Query(value = "Select * from persona p where p.cedula = :cedula", nativeQuery = true)
    public Persona buscarPersona(String cedula);

}
