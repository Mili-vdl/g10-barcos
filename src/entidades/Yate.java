/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author milip
 */
public class Yate extends Barco {

    private int cantCamarotes;
    private double potencia;

    public Yate() {
    }

    public Yate(int cantCamarotes, double potencia, String matricula, double eslora, int anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.cantCamarotes = cantCamarotes;
        this.potencia = potencia;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

}
