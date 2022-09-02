/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.AMotor;
import entidades.Velero;
import entidades.Yate;
import java.util.Scanner;

/**
 *
 * @author milip
 */
public class BarcoServicio {

    Scanner scan = new Scanner(System.in);

    public Velero crearVelero() {
        System.out.println("Ingrese la matricula");
        String matricula = scan.next();
        System.out.println("Ingrese la eslora en metros");
        double eslora = scan.nextDouble();
        System.out.println("Ingrese el ano de fabricacion");
        int ano = scan.nextInt();
        System.out.println("Ingrese la cantidad de mastiles");
        int mastil = scan.nextInt();

        return new Velero(mastil, matricula, eslora, ano);
    }

    public AMotor crearAMotor() {
        System.out.println("Ingrese la matricula");
        String matricula = scan.next();
        System.out.println("Ingrese la eslora en metros");
        double eslora = scan.nextDouble();
        System.out.println("Ingrese el ano de fabricacion");
        int ano = scan.nextInt();
        System.out.println("Ingrese la potencia en Caballo de Vapor");
        double potencia = scan.nextDouble();

        return new AMotor(potencia, matricula, eslora, ano);
    }

    public Yate crearYate() {
        System.out.println("Ingrese la matricula");
        String matricula = scan.next();
        System.out.println("Ingrese la eslora en metros");
        double eslora = scan.nextDouble();
        System.out.println("Ingrese el ano de fabricacion");
        int ano = scan.nextInt();
        System.out.println("Ingrese la potencia en Caballo de Vapor");
        double potencia = scan.nextDouble();
        System.out.println("Ingrese el numero de camarotes");
        int camarotes = scan.nextInt();

        return new Yate(camarotes, potencia, matricula, eslora, ano);
    }
}
