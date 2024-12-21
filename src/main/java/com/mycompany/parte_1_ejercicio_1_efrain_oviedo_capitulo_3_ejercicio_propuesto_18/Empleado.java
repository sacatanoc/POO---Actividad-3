/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte_1_ejercicio_1_efrain_oviedo_capitulo_3_ejercicio_propuesto_18;

/**
 *
 * @author Samuel Cataño C
 */
public class Empleado {
    String nombres, codigo;
    int horasMes;
    double valorHora, pctjRet;
    
    public Empleado(String codigo, String nombres, int horasMes, double valorHora, double pctjRet){
        this.codigo = codigo;
        this.nombres = nombres;
        this.horasMes = horasMes;
        this.valorHora = valorHora;
        this.pctjRet = pctjRet;
    }
    double salarioBruto(){
        return horasMes*valorHora;
    }
    double salarioNeto() {
        return horasMes*valorHora*(1-pctjRet/100);
    }
}
