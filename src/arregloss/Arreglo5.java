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
public class Arreglo5 {
    public static void main(String[]args) {
       // Scanner sc =  new Scanner(System.in);
        //System.out.println("Ingrese el tamanio del arreglo");
        int tam = Integer.parseInt(JOptionPane.showInputDialog(null,"digite el tamaño del arreglo"));
        int[]nums = new int[tam];
        JOptionPane.showMessageDialog(null,"Ingrese los " + tam +" numeros");
        //System.out.println("Ingrese los " + tam +" numeros");
        for(int i = 0; i < nums.length; i++) {
            nums[i] =Integer.parseInt(JOptionPane.showInputDialog(null,"digite el numero"));
        }
        int aux = 0;
        for(int i = 1; i < nums.length; i++) { //usamos el metodo de la burbuja
            for(int j = 0; j < nums.length - i; j++) {
                if(nums[j] > nums[j+1])
                {
                    aux = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = aux;
                }
            }
        }
        
        for(int i = 0; i <nums.length; i++) {
            JOptionPane.showMessageDialog(null,""+ nums[i]+"\n ");
        }
    }
 
    
 
    
}
