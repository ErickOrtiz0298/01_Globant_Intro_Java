package programa07;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class IdentificarPalabra {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String palabra; 
        System.out.print("Por favor ingresa una palabra: "); 
        
        palabra = sc.nextLine();
        
//        if(palabra.equals("eureka")){
//            System.out.println("Correcto");
//        }else{
//            System.out.println("Incorrecto");
//        }

//Con operador ternario 

System.out.println(palabra.equals("eureka")?"Correcto":"Incorrecto");
        
    }
    
}
