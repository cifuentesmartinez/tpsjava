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
public class For {
    public static void main(String[] args) {
    
    int canti,Num1,suma,cont;
    
    suma = 0;
    
     canti= Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE LA CANTIDAD DE NUMEROS "));
     
      for(cont=0;cont<canti;cont++) {
         Num1= Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE LA EDAD DE ALUMNOS "));
         suma=suma+Num1;
         //cont++;
         
    }
      JOptionPane.showMessageDialog(null,"la sumatoria de edades son: "+ suma);

    
    }
    
}

    

