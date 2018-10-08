/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.JOptionPane;

/**
 *
 * @author cifuentes0903
 */
public class Persona {
    
    
    String Nombre,Apellido,Direccion;
    int edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void captura(String Nom , String Ape ,String Dire,int ed){
     this.Nombre = Nom;
     this.Apellido = Ape;
     this.Direccion = Dire;
     this.edad = ed;
     
 }
    
    public double mayor(int edad){
      if (edad>=18){
      JOptionPane.showMessageDialog(null,"Eres mayor de edad");
      
      }else
          JOptionPane.showMessageDialog(null,"eres menor de edad");
        
        
    //JOptionPane.showMessageDialog(null,"la sumatoria es :"+Suma);
     return this.edad;
}

    
}
