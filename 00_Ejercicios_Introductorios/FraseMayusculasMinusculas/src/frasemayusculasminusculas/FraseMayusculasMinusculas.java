package frasemayusculasminusculas;

import java.util.Scanner;

/**
 * @author erick
 */
public class FraseMayusculasMinusculas {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       String frase; 
        String fraseMayusculas; 
         String fraseMinusculas; 
         
       System.out.print("Por favor ingresa una frase: ");
       
       frase = sc.nextLine();
       
       fraseMinusculas = frase.toLowerCase();
       fraseMayusculas = frase.toUpperCase();
       
       System.out.println(fraseMayusculas);
       System.out.println(fraseMinusculas);
       
    }
    
}
