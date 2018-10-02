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
public class Mayor {
    
    public static void main(String[] args) {
  
        
         Double Numero1,Numero2,Numero3;
        
        Numero1= Double.parseDouble(JOptionPane.showInputDialog(null, "DIGITE EL NUMERO 1"));
        Numero2= Double.parseDouble(JOptionPane.showInputDialog(null,"DIGITE EL NUMERO 2"));
        Numero3= Double.parseDouble(JOptionPane.showInputDialog(null,"DIGITE EL NUMERO 3"));
        
        if(Numero1>Numero2 && Numero1>Numero3){
            JOptionPane.showMessageDialog(null,"El numero 1 es mayor ");
            
        
        }else 
            if (Numero2>Numero1 && Numero2>Numero3){
            JOptionPane.showMessageDialog(null,"El numero 2 es mayor ");
            
            
            }else
                if(Numero3>Numero1 && Numero3>Numero2){
                JOptionPane.showMessageDialog(null,"El numero 3 es mayor ");
                
                }
             
                                   }
       
        
        
}
