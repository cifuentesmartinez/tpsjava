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
public class While {
    public static void main(String[] args) {
    
    int canti,Edad,suma,cont,promet;
    cont = 0;
    suma = 0;
    
     canti= Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE LA CANTIDAD DE Edades a ingresar "));
     
      while (cont<canti) {
         Edad= Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE LA EDAD DE ALUMNOS "));
         suma=suma+Edad; 
         promet=suma/canti;
         
         cont++;
         
    }
      JOptionPane.showMessageDialog(null,"la sumatoria de edades son: "+ suma);

    
    }
    
}
