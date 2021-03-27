/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_poo_aula04;

/**
 *
 * @author mcl_l
 */
import javax.swing.JOptionPane;

public class Circulo {
    double raio, area;
    double PI = 3.1416;
    
    public Circulo(float raio, float area, double PI){
        this.raio  = raio;
        this.area  = area; 
    }

    public Circulo() {
        raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o Raio do Circulo", "Raio", JOptionPane.INFORMATION_MESSAGE));
        area = PI * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio > 0){
            this.raio = raio;  
        }
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "O Circulo tem" + " um Raio de: " + raio + "\nSua Área Total é de: " + area;
    }   
}
