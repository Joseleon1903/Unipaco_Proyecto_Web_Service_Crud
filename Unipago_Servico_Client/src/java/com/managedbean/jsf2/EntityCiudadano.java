/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managedbean.jsf2;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author JoseEduardo
 */
@ManagedBean(name = "EntityCiudadano")
@RequestScoped
public class EntityCiudadano {

    private int Id;
    private String Nombre;
    private String Apellido;
    private String Sexo;
    private String Fecha;
    private String Direccion;
    private String Correo;
    private String Telefono;

    public EntityCiudadano() {
        this.Id = 0;
        this.Nombre = "";
        this.Apellido = "";
        this.Direccion = "";
        this.Correo = "";
        this.Telefono = "";
        this.Fecha = "";
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String requestIndex() {
        return "index";
    }

    public void Reset() {
        this.Id = 0;
        this.Nombre = "";
        this.Apellido = "";
        this.Direccion = "";
        this.Correo = "";
        this.Telefono = "";
        this.Fecha = "";
    }

}
