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
public class Velero extends Barco {
    private int cantMastiles;

    public Velero() {
    }

    public Velero(int cantMastiles, String matricula, double eslora, int anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.cantMastiles = cantMastiles;
    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }
    
    
    
}
