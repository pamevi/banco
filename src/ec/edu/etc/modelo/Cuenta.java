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
public abstract class Cuenta {
    public int id;
    public int saldo;
    public Cliente cliente;
    public double tasa_de_interes;

    public Cuenta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTasa_de_interes() {
        return tasa_de_interes;
    }

    public void setTasa_de_interes(double tasa_de_interes) {
        this.tasa_de_interes = tasa_de_interes;
    }

    @Override
    public String toString() {
        return "saldo " + saldo 
                + "\n tasa_de_interes " + tasa_de_interes 
                + "\n " + cliente 
                +"\n ";
    }
    
   
    abstract public boolean sacarDinero (Cuenta cuenta,int valor);
    abstract public double calculaInteres (Cuenta cuenta); 
}
