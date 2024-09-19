/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teorema;

/**
 *
 * @author ferch
 */
public class TrianguloRectangulo {
    
    Lado lado1;
    Lado lado2;
    private double hipotenusa;

    public TrianguloRectangulo() {
    }

    public TrianguloRectangulo(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public TrianguloRectangulo(Lado lado1) {
        this.lado1 = lado1;
    }

    public TrianguloRectangulo(Lado lado1, Lado lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Lado getLado1() {
        return lado1;
    }

    public void setLado1(Lado lado1) {
        this.lado1 = lado1;
    }

    public Lado getLado2() {
        return lado2;
    }

    public void setLado2(Lado lado2) {
        this.lado2 = lado2;
    }
    
    //Met
    public double CalcularHipotenusa(){
        double hipotenusa = Math.sqrt(Math.pow(lado1.CalcularLado(),2));
        return hipotenusa;
    }
    
}
