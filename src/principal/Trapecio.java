/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Samuel Cataño C
 */
public class Trapecio {
    double base1;
    double base2;
    double altura;
    Trapecio(double base1, double base2, double altura){
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
    }
    double calcularArea(){
        return (base1+base2)*(altura/2);
    }
    double calcularPerímetro(){
        return base1+base2+2*Math.sqrt(Math.pow(Math.abs(base1-base2)/2,2)+Math.pow(altura,2));
    }
}
