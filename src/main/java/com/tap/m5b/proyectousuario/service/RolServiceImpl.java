/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tap.m5b.proyectousuario.service;

import com.tap.m5b.proyectousuario.model.Rol;
import com.tap.m5b.proyectousuario.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author jhudy
 */
@Service
public class RolServiceImpl extends GenericServiceImpl<Rol, Integer> implements  GenericService<Rol, Integer>{

    @Autowired
    RolRepository rolRepository;
    
    @Override
    public CrudRepository<Rol, Integer> getDao() {
       return rolRepository;
    }
    
}
