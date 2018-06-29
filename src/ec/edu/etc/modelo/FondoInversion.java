/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.etc.modelo;

/**
 *
 * @author Usuario
 */
public class FondoInversion extends Cuenta {
    
    public int id;
    public double comision;
    
    public FondoInversion() {
        tasa_de_interes=0.34;
        comision=0.6;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getComision() {
        return comision;
    }
    
    public void setComision(double comision) {
        this.comision = comision;
    }
    
    @Override
    public String toString() {
        return "\n Fondo Inversion # " + id
                + "\n Comision " + comision
                + "\n " + super.toString();
    }
    
    @Override
    public boolean sacarDinero(Cuenta cuenta, int valor) {
        int saldoAnterior = cuenta.getSaldo();
        if (valor < cuenta.getSaldo()) {
            cuenta.setSaldo(cuenta.getSaldo() - valor);
            return true;
        } else if (cuenta.getSaldo() < valor) {
            cuenta.setSaldo(valor - cuenta.getSaldo());
            if (cuenta.getSaldo() <= 500) {
               cuenta.setSaldo(-1*getSaldo()); 
                return true;
            } else {
                cuenta.setSaldo(saldoAnterior);
                return false;
            }
            
        }
        return false;
    }
    
    @Override
     public double calculaInteres(Cuenta cuenta) {
        double saldo = (cuenta.getSaldo() * cuenta.getTasa_de_interes());
        double saldoTotal =saldo+cuenta.getSaldo();
        return saldoTotal;
    }
    
}
