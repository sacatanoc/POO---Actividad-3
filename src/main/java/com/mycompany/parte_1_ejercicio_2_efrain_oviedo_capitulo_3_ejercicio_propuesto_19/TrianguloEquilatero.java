/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte_1_ejercicio_2_efrain_oviedo_capitulo_3_ejercicio_propuesto_19;

/**
 *
 * @author Samuel Cataño C
 */
public class TrianguloEquilatero {
    double lado;
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }
    double Perimetro(){
        return 3*lado;
    }
    double Altura(){
        return lado*(Math.sqrt(3)/2);
    }
    double Area(){
        return lado*lado*(Math.sqrt(3)/4);
    }
}
