package centigradosfarenheit;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CentigradosFarenheit {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float centigrados; 
        float farenheit; 
        
        System.out.print("Por favor, intrduzca una cantidad de grados Centigrados: ");
        
        centigrados = sc.nextFloat(); 
        
        farenheit = 32 + (9 * centigrados / 5); 
        
        System.out.println("La temperatura en grados Farenheit es: " + farenheit);
        
    }
    
}
