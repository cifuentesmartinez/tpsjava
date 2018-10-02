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
public class Notas {
    public static void main(String[] args) {
        
        Double Nota1,Nota2,Nota3,Suma,Prome;
        
        Nota1= Double.parseDouble(JOptionPane.showInputDialog(null, "DIGITE LA NOTA 1"));
        Nota2= Double.parseDouble(JOptionPane.showInputDialog(null,"DIGITE LA NOTA 2"));
        Nota3= Double.parseDouble(JOptionPane.showInputDialog(null,"DIGITE LA NOTA 3"));
        
        Suma = Nota1+Nota2+Nota3;
        Prome = Suma/3;
        if(Prome>=4.5){
        JOptionPane.showMessageDialog(null,"usted aprobo con : "+ Prome);
        
        }else
        {
        JOptionPane.showMessageDialog(null,"usted no aprobo su nota : "+Prome);
        }
        
    
    
   
    }
    
}
