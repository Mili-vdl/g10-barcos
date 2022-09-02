/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.AMotor;
import entidades.Cliente;
import entidades.Velero;
import entidades.Yate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author milip
 */
public class ClienteServicio {

    Scanner scan = new Scanner(System.in);
    BarcoServicio bs = new BarcoServicio();
    Cliente c = new Cliente();

    public void nuevoAlquiler() {
        
        System.out.println("* Creación de nuevo alquiler *");
        System.out.println("Nombre del cliente:");
        c.setNombre(scan.next());
        System.out.println("Documento del cliente (" + c.getNombre() + ")");
        c.setDni(scan.nextInt());
        System.out.println("Ingrese la fecha de alquiler:");
        Date fechaAlq = nuevaFecha();
        c.setFechaAlquiler(fechaAlq);
        System.out.println("Ingrese la fecha de devolucion:");
        Date fechaDev = nuevaFecha();
        c.setFechaDevolucion(fechaDev);
        System.out.println("Ingrese la posicion del amarre:");
        c.setPosicionAmarre(scan.nextInt());
        System.out.println("¿Que barco lo ocupará? \nOpcion 1: velero\nOpcion 2: A Motor\nOpcion 3: Yate");
        int opc = scan.nextInt();

        switch (opc) {
            case 1:
                Velero v = bs.crearVelero();
                c.setBarco(v);
                break;
            case 2:
                AMotor am = bs.crearAMotor();
                c.setBarco(am);
                break;
            case 3:
                Yate y = bs.crearYate();
                c.setBarco(y);
                break;
        }
        System.out.println("\n Calculando precio del alquiler... \nEl precio final es $" + calculoAlquiler());
    }
    
    public double calculoAlquiler(){
        int dias=(int) ((c.getFechaDevolucion().getTime()-c.getFechaAlquiler().getTime())/86400000);
        double precio = dias * (c.getBarco().getEslora() * 10);
        return precio;
    }

    private Date nuevaFecha() {
        System.out.println("Día:");
        int dia = scan.nextInt();
        System.out.println("Mes:");
        int mes = scan.nextInt();
        System.out.println("Año:");
        int ano = scan.nextInt();
        return new Date(ano + 1900, mes, dia);
    }
}
