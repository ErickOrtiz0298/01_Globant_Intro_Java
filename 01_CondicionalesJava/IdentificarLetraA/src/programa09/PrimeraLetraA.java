package programa09;

import java.util.Scanner; 

/**
 * @author erick
 */
public class PrimeraLetraA {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String frase; 
        
        System.out.print("Ingrese una frase o palabra: ");
        
        frase = sc.nextLine(); 
        
//        if(frase.substring(0,1).equals("A")){
//            System.out.println("CORRECTO");
//        }else{
//            
//            System.out.println("INCORRECTO");
//        }

//Con operador ternario
System.out.println(frase.substring(0,1).equals("A")?"CORRECTO":"INCORRECTO");
        
        
        
        
        
    }
    
}
