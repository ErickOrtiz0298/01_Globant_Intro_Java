package programa08;

import java.util.Scanner;

public class LongitudString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String palabra; 
        
        System.out.print("Porfavor ingresa una palabra de longitud 8: ");
        palabra = sc.nextLine();
        
//        if(palabra.length() == 8){
//            System.out.println("Correcto");
//        } else{
//            System.out.println("Incorrecto");
//        }

//Usando operador ternario
System.out.println(palabra.length() == 8?"Correcto":"Incorrecto");
        
        
    }
    
}
