package programa10;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class SumaIterada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        float limite; 
        float numero; 
        float total = 0;
        
        System.out.print("Ingrese un valor limite positvo: ");
        limite = sc.nextFloat();
        
        do{
            System.out.print("Ingrese numeros consecutivamente, se sumaran hasta rebasar el limite: ");
            numero = sc.nextFloat();
            total += numero; 
            System.out.println(total);
            
        }while(total < limite);
        
        
    }
    
}
