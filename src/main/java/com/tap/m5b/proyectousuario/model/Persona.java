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
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author jhudy
 */
@Data
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int id_persona;

    @Size(min = 3, max = 15, message = "El nombre de la persona debe tener entre 3 y 15 caracteres")
    @NotBlank(message = "El nombre no puede estar en blanco")
    @Column(name = "nombre")
    private String nombre;

    @Size(min = 3, max = 15, message = "El apellido de la persona debe tener entre 3 y 15 caracteres")
    @NotBlank(message = "El apellido no puede estar en blanco")
    @Column(name = "apellido")
    private String apellido;

    @Size(min = 10, max = 10, message = "La cedula de la persona debe tener 10 caracteres")
    @NotBlank(message = "La cedula no puede estar en blanco")
    @Column(name = "cedula")
    private String cedula;

    @NotBlank(message = "La dirección no puede estar en blanco")
    @Column(name = "direccion")
    private String direccion;

    @NotBlank
    @Column(name = "celular")
    private String celular;

    @Email(message = "Se debe ingresar un dirección de correo válida ")
    @Column(name = "correo")
    private String correo;

    @NotBlank(message = "La contraseña no debe estar vacía")
    @Size(max = 8, min = 5, message = "La contraseña debe estar entre 8 y 5 caracteres")
    @Column(name = "password")
    private String contrasenia;

    @JsonIgnore
    @OneToMany(mappedBy = "persona")
    private List<Usuario> listaUsuarios;

}
