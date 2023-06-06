/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tap.m5b.proyectousuario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author jhudy
 */
@Data
@Entity
public class Producto {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int id_producto;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Column(name = "descripcion")
    private String descripcion;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Column(name = "categoria")
    private String categoria;

    @Column(name = "precio_emprendedor")
    @NotNull(message = "El precio emprendedor no puede estar vacío")
    @Min(value = 1, message = "El valor debe ser mayor o igual a 1")
    private double precio_emprendedor;

    @NotBlank(message = "La dirección de imagen no puede estar vacía")
    @Column(name = "imagen")
    private String imagen;

    @ManyToOne
    @JoinColumn(name="id_compra",referencedColumnName = "id_compra")
    private Compra compra;
}
