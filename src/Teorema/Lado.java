/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teorema;
import java.lang.Math;

/**
 *
 * @author ferch
 */
public class Lado {
    Punto punto1;
    Punto punto2;

    public Lado() {
    }
    
    public Lado(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
    
    //Met
    public double CalcularLado(){
        double lado1 = Math.pow(punto2.getCoordX()-punto1.getCoordX(), 2);
        double lado2 = Math.pow(punto2.getCoordY() - punto1.getCoordY(), 2);
        double lado = Math.sqrt(lado1 + lado2);
        return lado;
    }
}
