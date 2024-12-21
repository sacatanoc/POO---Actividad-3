/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte_1_ejercicio_4_efrain_oviedo_capitulo_4_ejercicio_resuelto_10;

/**
 *
 * @author Samuel Cataño C
 */
public class Estudiante {
    String numeroDeInscripcion, nombres;
    int estrato;
    double patrimonio;
    public Estudiante(String numIns, String names, int str, double pat) {
        this.numeroDeInscripcion = numIns;
        this.estrato = str;
        this.nombres = names;
        this.patrimonio = pat;
    }
    
    double calcularMatricula(){
        if (patrimonio>2000000&&estrato>3){
            return 50000+0.03*patrimonio;
        } else {
            return 50000;
        }
    }
}
