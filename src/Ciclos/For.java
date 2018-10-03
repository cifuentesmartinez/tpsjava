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
    
    int canti,cont,Num1,Contne,Conpos,Sumapo,Sumane,Promepo = 0,Promene=0;
    cont= 0;
    Sumapo=0;
    Sumane=0;
    
    Contne = 0;  
    Conpos =0;
     canti= Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE LA CANTIDAD DE NUMEROS "));
     
      for(cont=0;cont<canti;cont++) {
         Num1= Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE EL NUMERO "));
         if (Num1>0){
         Conpos++;
         Sumapo=Sumapo+Num1;
         Promepo=Sumapo/canti;
         
         }else{
         Contne++;
         Sumane=Sumane+Num1;
         Promene=Sumane/canti;
         }
         //cont++;
         
    }
      JOptionPane.showMessageDialog(null,"la canti de positivos son: "+ Conpos);
      JOptionPane.showMessageDialog(null,"la canti de negativos son: "+ Contne);
      JOptionPane.showMessageDialog(null,"la sumatoria de positovs son: "+ Sumapo);
      JOptionPane.showMessageDialog(null,"la sumatoria de negativos son: "+ Sumane);
      JOptionPane.showMessageDialog(null,"la promedio de positivos son: "+ Promepo);
      JOptionPane.showMessageDialog(null,"la promedio de positivos son: "+ Promene);
    
    }
    
}

    

