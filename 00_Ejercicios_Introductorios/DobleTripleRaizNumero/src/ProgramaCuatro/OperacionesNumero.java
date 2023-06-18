package ProgramaCuatro;

import java.util.Scanner; 

public class OperacionesNumero {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        float numero; 
        
        System.out.print("Por favor ingresa un numero para duplicarlo, triplicarlo y calcular su raíz: "); 
        
        numero = sc.nextFloat();
        
        System.out.println("El doble del numero es: " + (2 * numero));
        
        System.out.println("El triple del numero es: " + (3 * numero));
        
        System.out.println("La raiz cuadrada del numero es: " +  Math.sqrt(numero));
        
    }
    
}
