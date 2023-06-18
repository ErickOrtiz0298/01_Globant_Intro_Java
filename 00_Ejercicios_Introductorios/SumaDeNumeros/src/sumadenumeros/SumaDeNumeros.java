package sumadenumeros;

import java.util.Scanner;
/**
 * @author erick
 */
public class SumaDeNumeros {

    public static void main(String[] args) {
         int numero1, numero2;
         Scanner sc = new Scanner(System.in);
       
        System.out.println("Por favor ingrese dos numeros enteros para poder calcular su suma");
        
        System.out.print("Por favor ingrese el primer numero: ");
        numero1 = sc.nextInt();
        
        System.out.print("Por favor ingrese el segundo numero: ");
        numero2 = sc.nextInt();
        
        System.out.println("La suma de los numeros ingresados es: " + (numero1 + numero2));
        
    }
    
}
