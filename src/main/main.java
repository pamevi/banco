/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import ec.edu.etc.controlador.ControladorCuenta;
import ec.edu.etc.controlador.ControladorFondoInversion;
import ec.edu.etc.modelo.Banco;
import ec.edu.etc.modelo.Cliente;
import ec.edu.etc.modelo.Cuenta;
import ec.edu.etc.modelo.CuentaCorriente;
import ec.edu.etc.modelo.CuentaVivienda;
import ec.edu.etc.modelo.Direccion;
import ec.edu.etc.modelo.FondoInversion;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion direccion = new Direccion();
        direccion.setId(1);
        direccion.setCalleP("Calle tarqui");
        direccion.setCalleS("Calle larga");
        direccion.setProvincia("azuay");
        Direccion direccion1 = new Direccion();
        direccion1.setId(2);
        direccion1.setCalleP("Calle remigio crespo");
        direccion1.setCalleS("av loja");
        direccion1.setProvincia("azuay");

        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setCedula("0102306548");
        cliente.setNombre("Jose");
        cliente.setApellido("Juma");
        cliente.setTelefono("888999");
        cliente.setDireccion(direccion);
        Cliente cliente1 = new Cliente();
        cliente1.setId(2);
        cliente1.setCedula("0102306000");
        cliente1.setNombre("Juan");
        cliente1.setApellido("Jarama");
        cliente1.setTelefono("888777");
        cliente1.setDireccion(direccion1);
        Cliente cliente2 = new Cliente();
        cliente2.setId(3);
        cliente2.setCedula("0102306548");
        cliente2.setNombre("Maria");
        cliente2.setApellido("Juca");
        cliente2.setTelefono("555333");
        cliente2.setDireccion(direccion1);

        FondoInversion fondoInversion = new FondoInversion();
        fondoInversion.setId(1);
        fondoInversion.setSaldo(1000);
        fondoInversion.setCliente(cliente);

        CuentaCorriente cuentaCorriente = new CuentaCorriente();
        cuentaCorriente.setId(2);
        cuentaCorriente.setSaldo(9000);
        cuentaCorriente.setCliente(cliente1);

        CuentaVivienda cuentaVivienda = new CuentaVivienda();
        cuentaVivienda.setId(3);
        cuentaVivienda.setSaldo(2000);
        cuentaVivienda.setCliente(cliente2);

        //Ingresar tipo de cuenta y valor a depositar
        ControladorCuenta controladorCuenta = new ControladorCuenta();
        int deposito=255;
        String ingresar = "fi";
        if (ingresar.equalsIgnoreCase("cc")) {
            controladorCuenta.ingresarDinero(cuentaCorriente, deposito);

            System.out.println("Se ingreso valor en la cuenta corriente: "+deposito);
        }
        if (ingresar.equalsIgnoreCase("cv")) {
            controladorCuenta.ingresarDinero(cuentaVivienda, deposito);
            System.out.println("Se ingreso dinero en la cuenta vivienda: "+deposito);
        }
        if (ingresar.equalsIgnoreCase("fi")) {
            controladorCuenta.ingresarDinero(fondoInversion, deposito);
            ControladorFondoInversion controladorfondoInversion = new ControladorFondoInversion();
          int puntos=  controladorfondoInversion.calcularPuntos(fondoInversion,deposito);
            System.out.println("Se ingreso dinero en fondo inversion: "+deposito);
            System.out.println("Puntos disponibles: "+ puntos);
        }

        //Ingresar la cuenta corriente y el valor a retirar 
        int valorRetCorr = 0;
        if (valorRetCorr != 0) {
            if (cuentaCorriente.sacarDinero(cuentaCorriente, valorRetCorr) == true) {
                System.out.println("Dinero Retirado Cuenta Corriente: "+ valorRetCorr);
            } else {
                System.out.println("No se puede retirar saldo insuficiente");
            }
        }

        //Cuenta de la vivienda
        if (cuentaVivienda.sacarDinero(cuentaVivienda, 0) == false) {
            System.out.println("No se puede retirar dinero de este tipo de cuenta (Cuneta vivienda)");
        }

        //Ingresar la fondo de inversion y el valor a retirar
        int valor = 0;
        if (valor != 0) {
            if (fondoInversion.sacarDinero(fondoInversion, valor) == true) {
                System.out.println("Dinero Retirado Fondo de Inversion: "+valor);
            } else {
                System.out.println("Cuenta Fondo de Inversion bloqueada");
            }
        }

        //cosultar saldo 
        //ingresar la cuenta 
        String activarSaldo = "no";
        if (activarSaldo.equalsIgnoreCase("si")) {
            double consltarSaldo = controladorCuenta.consultarSaldo(fondoInversion);
            System.out.println("Consultar saldo " + consltarSaldo);
        }

        Banco banco = new Banco();
        banco.setId(1);
        banco.setNombre("Banco de Machala");
        banco.clienteList.add(cliente);
        banco.clienteList.add(cliente1);
        banco.clienteList.add(cliente2);
        banco.cuentaList.add(fondoInversion);
        banco.cuentaList.add(cuentaCorriente);
        banco.cuentaList.add(cuentaVivienda);

        System.out.println("");
        String mostrarBanco = "si";
        if (mostrarBanco.equalsIgnoreCase("si")) {
            System.out.println("" + banco.toString());
        }
         //Revisar mensual
        //Ingresar cuenta, caculo del interes de la cuenta , valor de la comision
        String activar = "si";
        if (activar.equalsIgnoreCase("si")) {
            double mensualVivienda = controladorCuenta.revisarMensual(cuentaVivienda, cuentaVivienda.calculaInteres(cuentaVivienda), cuentaVivienda.getComision());
            double mensualCorriente = controladorCuenta.revisarMensual(cuentaCorriente, cuentaCorriente.calculaInteres(cuentaCorriente), cuentaCorriente.getComision());
            double mensualInversion = controladorCuenta.revisarMensual(fondoInversion, fondoInversion.calculaInteres(fondoInversion), fondoInversion.getComision());
            System.out.println("Revisar mensual Cuenta Vivienda:  " + mensualVivienda);
            System.out.println("Revisar mensual Cuenta Corriente: " + mensualCorriente);
            System.out.println("Revisar mensual Fonde de Inversion: " + mensualInversion);
        }
    }

}
