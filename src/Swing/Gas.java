/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.JOptionPane;

/**
 *
 * @author cifuentes0903
 */



    

public class Gas {
 public   Double Num1,Num2,Suma,Resta,Divi,Multi;
 
 public void capturar(Double Num1 , Double Num2){
     this.Num1 = Num1;
     this.Num2 = Num2;
     
 }

public double sumar(Double Num1, Double Num2){
    Suma = Num1+Num2;
    //JOptionPane.showMessageDialog(null,"la sumatoria es :"+Suma);
     return this.Suma;
}
  public double resta(Double Num1, Double Num2){
    Resta = Num1-Num2;
    //JOptionPane.showMessageDialog(null,"la sumatoria es :"+Suma);
     return this.Resta;

     }    
    public double multi(Double Num1, Double Num2){
    Multi = Num1*Num2;
    //JOptionPane.showMessageDialog(null,"la sumatoria es :"+Suma);
     return this.Multi;
    }
     
     public double dividir(Double Num1, Double Num2){
    Divi = Num1/Num2;
    //JOptionPane.showMessageDialog(null,"la sumatoria es :"+Suma);
     return this.Divi;


    
    
    
   
}}
