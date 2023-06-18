package Programa06;

import java.util.Scanner;
/**
 *
 * @author erick
 */
public class ParImpar {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int numero; 
       
       System.out.print("Introduce un numero para que sepas si es par o impar: ");
       numero = sc.nextInt(); 
       
//       if(numero%2 == 0){
//           System.out.println("El numero " + numero + " es par.");
//       } else {
//           System.out.println("El numero " + numero + " es impar.");
//       }

    //Con operador ternario
    System.out.println(numero%2==0?"El numero " + numero + " es par.":"El numero " + numero + " es impar.");   

   }
}
