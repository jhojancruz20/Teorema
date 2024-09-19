/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teorema;

/**
 *
 * @author ferch
 */
public class TeoremaPitagoras {
    Punto punto1;
    Punto punto2;
    Lado lado;
    TrianguloRectangulo triangulo;
    
    //Constr
    public TeoremaPitagoras() {
    }

    public TeoremaPitagoras(Punto punto1, Punto punto2, Lado lado, TrianguloRectangulo triangulo) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.lado = lado;
        this.triangulo = triangulo;
    }
    
    //G and S

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

    public Lado getLado() {
        return lado;
    }

    public void setLado(Lado lado) {
        this.lado = lado;
    }

    public TrianguloRectangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(TrianguloRectangulo triangulo) {
        this.triangulo = triangulo;
    }
    
    public static void main(String[] args) {
        System.out.println("/////////  TEOREMA DE PITAGORAS  /////////");
         Punto punto1 = new Punto(5.2, 3.5);
         Punto punto2 = new Punto(3.2, 4.5);
         Lado lado1 = new Lado(punto1,punto2);
         Lado lado2 = new Lado(punto1,punto2);
         
         lado1.CalcularLado();
         lado2.CalcularLado();
         
         TrianguloRectangulo triangulo = new TrianguloRectangulo(lado1, lado2);
         
         System.out.println("La hipotenusa del triangulo es: " + triangulo.CalcularHipotenusa());
         
    }
    
   
}
