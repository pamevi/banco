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
public class Direccion {
    public int id;
    public String calleP;
    public String calleS;
    public String provincia;

    public Direccion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalleP() {
        return calleP;
    }

    public void setCalleP(String calleP) {
        this.calleP = calleP;
    }

    public String getCalleS() {
        return calleS;
    }

    public void setCalleS(String calleS) {
        this.calleS = calleS;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return  ":" +
                "\n "+ calleP + " y " + calleS 
                + "\n Provincia " + provincia
                +"\n";
    }
    
    
}
