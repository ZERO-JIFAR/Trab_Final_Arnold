package com.portfolio.mgb.Security.Dto;

import java.util.HashSet;
import java.util.Set;
//import javax.validation.constraints.NotBlank;

public class NuevoUsuario {
    //@NotBlank
    // Todos los @NotBlank son agregados por mi (estos evitan que los campos esten en blanco)
    private String nombre;
    //@NotBlank
    private String nombreUsuario;
    //@NotBlank
    private String email;
    //@NotBlank
    private String password;
    //@NotBlank
    private Set<String> roles = new HashSet<>();
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
    
    
}