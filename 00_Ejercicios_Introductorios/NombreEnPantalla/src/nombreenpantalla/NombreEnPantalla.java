package nombreenpantalla;

import java.util.Scanner;
/**
 *
 * @author erick
 */
public class NombreEnPantalla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String nombre; 
        
        System.out.print("Por favor ingresa tu nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Mucho gusto " + nombre + " un placer saludarte");
        
    }
    
}
