/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nug;

/**
 *
 * @author lolag
 */
public class Cliente {
    private String Name;
    private String ApellidoP;
    private String ApellidoM;
    private int Edad;
    private String PesoInicial;
    private String AlturaInicial;

    public Cliente(String Name, String ApellidoP, String ApellidoM, int Edad, String PesoInicial, String AlturaInicial) {
        this.Name = Name;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Edad = Edad;
        this.PesoInicial = PesoInicial;
        this.AlturaInicial = AlturaInicial;
    }

    public String getName() {
        return Name;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public int getEdad() {
        return Edad;
    }

    public String getPesoInicial() {
        return PesoInicial;
    }

    public String getAlturaInicial() {
        return AlturaInicial;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setPesoInicial(String PesoInicial) {
        this.PesoInicial = PesoInicial;
    }

    public void setAlturaInicial(String AlturaInicial) {
        this.AlturaInicial = AlturaInicial;
    }
    
    
}
