
package sumatoria;

import java.util.Scanner;

/**
 *
 * @author cifuentes0903
 */
public class Sumatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //este es mi comit
        double Num1,Num2,Suma,Resta,Multi,Divi;
        String  Nombre;
        
        Scanner Captura = new Scanner(System.in);
        
        System.out.print("Digite su nombre");
        Nombre = Captura.nextLine();
        System.out.print("Digite el numero");
        Num1 = Captura.nextDouble();
        System.out.print("Digite el segundo numero");
        Num2 = Captura.nextDouble();
        Suma = Num1+Num2;
        System.out.print("El resultado de la suma es: "+Suma);
        System.out.println("observacion final");
        
                
    }
    
}
