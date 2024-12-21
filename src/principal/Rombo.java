/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Samuel Cataño C
 */
public class Rombo {
    double diag1;
    double diag2;
    Rombo(double diag1, double diag2){
        this.diag1 = diag1;
        this.diag2 = diag2;
    }
    double calcularArea(){
        return (diag1*diag2)/2;
    }
    double calcularPerímetro(){
        return 4*Math.sqrt(Math.pow(diag1/2,2)+Math.pow(diag2/2,2));
    }
}
