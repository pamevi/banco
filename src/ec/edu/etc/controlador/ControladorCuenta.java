/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.etc.controlador;

import ec.edu.etc.modelo.Cuenta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorCuenta {

    public List<Cuenta> lista;

    public ControladorCuenta() {
        lista = new ArrayList<>();
    }

    public int ingresarDinero(Cuenta cuenta, int valor) {
        int saldo = 0;
        cuenta.setSaldo(cuenta.getSaldo() + valor);
        return saldo;
    }

    public double consultarSaldo(Cuenta cuenta) {

        return cuenta.getSaldo();
    }

    public double revisarMensual(Cuenta cuenta, double tasa, double comision) {
        double saldo = cuenta.getSaldo() + tasa - comision;
        return saldo;
    }

}
