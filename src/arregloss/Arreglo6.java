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
public class Arreglo6 {
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
        int par = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) //contamos cuantos pares existen
                par++;
        }
        int[]pares = new int[par]; //creamos un arreglo de "par" cantidad de pares
        int[]impares = new int[nums.length - par]; // creamos otros arreglo para impares
        int j = 0;
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                pares[j] = nums[i]; //guardamos cada par que encontremos
                j++;
            } else {
                impares[k] = nums[i]; //guardamos cada impar que encontremos
                k++;
            }
                
        }
        JOptionPane.showMessageDialog(null,"Los numeros Pares");
        for(int i = 0; i < pares.length; i++) {
            JOptionPane.showMessageDialog(null,""+ pares[i]+"\n ");
            System.out.print(pares[i] + "  ");
        }
       // System.out.println();
        JOptionPane.showMessageDialog(null,"Los numeros Impares");
        for(int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + "  ");
            JOptionPane.showMessageDialog(null,""+ impares[i]+"\n ");
        }
    }
  

    
    
}
