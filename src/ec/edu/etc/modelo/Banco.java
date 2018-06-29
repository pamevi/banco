/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.etc.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Banco {

    public int id;
    public String nombre;
    public List<Cuenta> cuentaList;
    public List<Cliente> clienteList;

    public Banco() {
        cuentaList = new ArrayList<>();
        clienteList = new ArrayList<>();
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cuenta> getCuentaList() {
        return cuentaList;
    }

    public void setCuentaList(List<Cuenta> cuentaList) {
        this.cuentaList = cuentaList;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    @Override
    public String toString() {
        return "Banco : " + id 
                + "\n Nombre " + nombre 
                + "\n Cuentas : " + cuentaList
                + "\n \n Clientes : " + clienteList;
    }
    
    
}
