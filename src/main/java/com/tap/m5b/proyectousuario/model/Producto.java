/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tap.m5b.proyectousuario.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
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
    private int idproducto;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Column(name = "descripcion")
    private String descripcion;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Column(name = "categoria")
    private String categoria;

    @Column(name = "precio_emprendedor")
    @NotNull(message = "El precio emprendedor no puede estar vacío")
    @DecimalMin(value = "1.0", message = "El valor debe ser mayor o igual a 1")
    private double precioEmprendedor;

    @NotBlank(message = "La dirección de imagen no puede estar vacía")
    @Column(name = "imagen")
    private String imagen;

    //Relaciones
    @JsonIgnore
    @OneToMany(mappedBy = "producto")
    private List<Compra> compras;

    @JsonIgnore
    @OneToMany(mappedBy = "producto")
    private List<Venta> ventas;
    
    @JsonIgnore
    @OneToOne(mappedBy = "producto")
    private Inventario inventario;
}
