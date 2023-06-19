package programa11;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CalculadoraBasica {
    
    public static String preguntar(){
        Scanner sc2 = new Scanner(System.in);
        String response;
        System.out.print( "¿Está seguro que desea salir del programa(S/N)?");
        response = sc2.nextLine().toUpperCase();
    return response;
    }

    public static void main(String[] args) {
        int numero1;
        int numero2;
        String opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Porfavor ingrese dos numeros, posteriormente seleccione una de las siguientes opciones: ");
            System.out.print("Porfavor ingrese el primer numero: ");
            numero1 = sc.nextInt();
            System.out.print("Porfavor ingrese el segundo numero: ");
            numero2 = sc.nextInt();

            System.out.print("MENU \n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir\nElija Opcion: ");
            opcion = sc.next();

            System.out.println
                (
                    opcion.equals("1") ? numero1 + numero2 :
                    opcion.equals("2") ? numero1 - numero2  : 
                    opcion.equals("3") ? numero1 * numero2  :
                    opcion.equals("4") ? numero1 / numero2  :
                    opcion.equals("5") ? opcion = preguntar() :"Opcion no valida"
                 );

        } while (!opcion.equals("S"));

    }

}
