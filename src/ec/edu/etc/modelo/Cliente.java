/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.etc.modelo;

/**
 *
 * @author Usuario
 */
public class Cliente {
    public int id;
    public String nombre;
    public String apellido;
    public String cedula;
    public String telefono;
    public Direccion direccion;

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente "  + id 
                + "\n Nombre " + nombre 
                + "\n Cedula " + cedula 
                + "\n Telefono " + telefono 
                + "\n Direccion " + direccion ;
    }
    
    
    
    
}
