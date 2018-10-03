/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author cifuentes0903
 */
public class Do {
    public static void main(String[] args) {
    
    int canti,Sueldo,suma,Prome,cont=0;
    
    suma = 0;
    
     canti= Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE LA CANTIDAD Empleados "));
     
      do {
         Sueldo= Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE EL SUELDO "));
         suma=suma+Sueldo;
         Prome=suma/canti;
         cont++;
         
    }while(cont<canti);
      JOptionPane.showMessageDialog(null,"la sumatoria de sueldo es : "+ suma);
      JOptionPane.showMessageDialog(null,"la sumatoria de sueldo es : "+ Prome);

    
    }
    
}
    

