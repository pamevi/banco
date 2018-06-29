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
public class CuentaCorriente extends Cuenta {

    public int id;
    public double comision;

    public CuentaCorriente() {
        tasa_de_interes = 0.1;
        comision = 0.6;
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
        return "\n Cuenta Corriente # " + id
                + "\n Comision " + comision
                + "\n " + super.toString();
    }

    @Override
    public boolean sacarDinero(Cuenta cuenta, int valor) {
        if (valor < cuenta.getSaldo()) {
            int saldo = 0;
            cuenta.setSaldo(cuenta.getSaldo() - valor);
            return true;
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
