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
import jakarta.validation.constraints.DecimalMin;
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
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private int idventa;

    @Column(name = "cantidad")
    @NotNull(message = "La cantidad no puede estar vacía")
    @Min(value = 1, message = "El valor debe ser mayor o igual a 1")
    private int cantidad;
    
    @Column(name = "precio")
    @NotNull(message = "El precio no puede estar vacío")
    @DecimalMin(value = "1.0", message = "El valor debe ser mayor o igual a 1")
    private double precio;
    
    @Column(name = "fecha_venta")
    @NotBlank(message = "La fecha de la venta no puede estar vacía")
    private String fechaventa;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private Producto producto;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario user;

}
