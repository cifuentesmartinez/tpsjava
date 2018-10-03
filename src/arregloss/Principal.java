/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloss;

import javax.swing.JOptionPane;

/**
 *
 * @author cifuentes0903
 */
public class Principal {
    public static void main(String args[]){
        
    Double Num1,Num2,Suma,Resta,Divi,Multi;
    int option=0; String opc=""; 
    
     opc = JOptionPane.showInputDialog("SELECCIONA LA OPCION: \n"
             +" 1: Definir un arreglo \n"
             +" 2: Arreglo1 \n"
             +" 3: Multi \n"
             +" 4: Divi \n ");
     
     option = Integer.parseInt(opc);
     
      switch ( option ) {
          
      case 1:
                //asignacion de valores a elementos del arreglo;

         //int array1[]; //declaración arreglo de tipo numérico
    String array1[];

         array1= new String[3];
//tamaño del arreglo es 3 elementos
        int i= 0;
//asignacion de valores a elementos del arreglo;

array1[0] = "Paola";
array1[1] = "Joe"; 
array1[2] = "Sebastian";

for (i=0;i<array1.length;i++){

//System.out.println( "El valor de la posicion "+i+" es "+" " +"  "+ array1[i]);
JOptionPane.showMessageDialog(null,"El valor de la posicion "+i+" es "+" " +"  "+ array1[i]);
}
         
           break;
      case 2:
           
    break;

           
      case 3:
           
          JOptionPane.showMessageDialog(null,"El resultado es");
           break;
      case 4:
           
          JOptionPane.showMessageDialog(null,"El resultado es");
           break;
      default:
          JOptionPane.showMessageDialog(null,"Debe ingresar una opcion correcta");
           break;
      }
   }
    


    
}
