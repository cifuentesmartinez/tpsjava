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
public class Arreglo2 {
    private int arr[]; 

public Arreglo2(){ 
arr = new int [10]; 
for (int i=1; i<arr.length; i++){ 
arr[i]=0; 
} 
} 
public void leer(){ 
for(int i=0; i<arr.length; i++){ 
arr[i] =Integer.parseInt(JOptionPane.showInputDialog(null,"digite el numero")); 
} 
} 
public int suma(){ 
int suma=0; 
for (int i=0; i<arr.length; i++){ 
suma+=arr[i]; 
} 
return suma; 
} 

public int promedio(){ 
int promedio=0; 
promedio=suma()/arr.length; 
return promedio; 
} 
public static void main(String[] args) { 
Arreglo2 a=new Arreglo2(); 
a.leer(); 
JOptionPane.showMessageDialog(null,"La suma de los elementos del arreglo es: "+ a.suma()); 
JOptionPane.showMessageDialog(null,"El promedio de los elementos del arreglo es: "+ a.promedio()); 
} 
}
