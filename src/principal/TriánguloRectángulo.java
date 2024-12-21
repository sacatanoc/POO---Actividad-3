/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Samuel Cataño C
 */
public class TriánguloRectángulo {
    double base;
    double altura;
    public TriánguloRectángulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    double calcularArea(){
        return (base*altura)/2;
    }
    double calcularPerímetro(){
        return (base+altura+calcularHipotenusa());
    }
    double calcularHipotenusa() {
        return Math.pow(base*base+altura*altura, 0.5);
    }
    String determinarTipoTriángulo() {
        if ((base==altura)&&(base==calcularHipotenusa())&(altura==calcularHipotenusa())) {
            return "Es un triángulo equilátero";
        } else if ((base!=altura)&&(base!=calcularHipotenusa())&(altura!=calcularHipotenusa())) {
            return "Es un triángulo escaleno";
        } else {
            return "Es un triángulo isósceles";
        }
    }
}
