/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte_1_ejercicio_5_efrain_oviedo_capitulo_4_ejercicio_propuesto_22;

/**
 *
 * @author Samuel Cataño C
 */
public class Empleado {
    String nombre;
    double salBas, horasMes;
    public Empleado(String nombre, double salBas, double horasMes) {
        this.nombre = nombre;
        this.salBas = salBas;
        this.horasMes = horasMes;
    }
    double calcularSalario(){
        return salBas*horasMes;
    }
}
