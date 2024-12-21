/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Samuel Cataño C
 */
public class Círculo {
    double radio;
    Círculo(double radio){
        this.radio = radio;
    }
    
    double calcularÁrea(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    double calcularPerímetro(){
        return 2*Math.PI*radio;
    }
}

