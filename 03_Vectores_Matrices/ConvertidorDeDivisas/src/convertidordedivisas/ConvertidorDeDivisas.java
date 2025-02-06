package convertidordedivisas;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class ConvertidorDeDivisas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cantidad de Euros para convertir: ");
        double cantidadEuros = sc.nextInt();

        System.out.print("¿En que tipo de divisa quieres la conversión?");
        System.out.println("\n\tL(libras), D(dolar), Y(yenes):");
        String divisa = sc.next().toUpperCase();

        convertirDivisa(cantidadEuros,divisa);
    }
    static void convertirDivisa(double cantidadEuros, String divisa){
        double conversion;
        if(divisa.equals("L")){
            conversion = cantidadEuros * 0.86;
        }else if(divisa.equals("D")){
            conversion = cantidadEuros * 1.28611;
        }else{
            conversion = cantidadEuros * 129.852;
        }
        System.out.println("El cambio de divisas es: " + conversion);
    }
}
