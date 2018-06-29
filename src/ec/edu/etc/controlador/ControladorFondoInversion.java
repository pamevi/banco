/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.etc.controlador;

import ec.edu.etc.modelo.Cuenta;

/**
 *
 * @author Usuario
 */
public class ControladorFondoInversion {

    public int calcularPuntos(Cuenta cuenta, int valor) {
        int total = valor/6;
        return total;
        
    }

}
