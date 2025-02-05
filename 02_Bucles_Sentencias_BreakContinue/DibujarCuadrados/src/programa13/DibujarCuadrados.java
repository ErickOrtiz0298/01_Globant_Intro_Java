package programa13;
import java.util.Scanner;

/**
 *
 * @author erick
 */
public class DibujarCuadrados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int tamanio; 
        System.out.print("Ingrese el tamanio del cuadrado ejemplo 2,3, etc: ");
        tamanio = sc.nextInt(); 
        
        for(int i = 0; i < tamanio; i++){
            if(i == 0 || i== tamanio-1){
                for(int j = 0; j<tamanio; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }else{
                    String s="";
                    for(int j = 0; j<tamanio;j++){
                        if(j == 0 || j == tamanio-1){
                            s += "*";
                        }else{
                            s += " ";
                        }
                    }
                    System.out.println(s);

            }
        }
        
    }
    
}
