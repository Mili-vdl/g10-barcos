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
public class AMotor extends Barco {

    private double potenciaCV;

    public AMotor() {
    }

    public AMotor(double potenciaCV, String matricula, double eslora, int anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

}
