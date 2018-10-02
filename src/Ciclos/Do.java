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
    
    int canti,Num1,suma,cont=0;
    
    suma = 0;
    
     canti= Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE LA CANTIDAD DE NUMEROS "));
     
      do {
         Num1= Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE LA EDAD DE ALUMNOS "));
         suma=suma+Num1;
         cont++;
         
    }while(cont<canti);
      JOptionPane.showMessageDialog(null,"la sumatoria de edades son: "+ suma);

    
    }
    
}
    

