/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tap.m5b.proyectousuario.service;

import com.tap.m5b.proyectousuario.model.Persona;
import com.tap.m5b.proyectousuario.repository.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author jhudy
 */
@Service
public class PersonaServicelmpl extends GenericServiceImpl<Persona, Integer> implements  GenericService<Persona, Integer>{

    @Autowired
    PersonasRepository personaRepository;
    
    @Override
    public CrudRepository<Persona, Integer> getDao() {
       return personaRepository;
    }
}
