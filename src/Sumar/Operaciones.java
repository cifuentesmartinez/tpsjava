/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumar;

import javax.swing.JOptionPane;

/**
 *
 * @author cifuentes0903
 */
public class Operaciones {
    
    public static void main(String[] args) {
        
        Double Num1,Num2,Suma,Resta,Multi;
        
        Num1= Double.parseDouble(JOptionPane.showInputDialog(null, "DIGITE EL NUMERO 1"));
        Num2= Double.parseDouble(JOptionPane.showInputDialog(null,"DIGITE EL NUMERO 2"));
        
        Suma = Num1 + Num2;
        JOptionPane.showMessageDialog(null,"El resultado de la suma es : "+Suma);
    
    
   
    }
    
}
