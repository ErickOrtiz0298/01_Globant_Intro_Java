package programa12;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class DispositivoRS232 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("SIMULADOR DE RS232");

        do {

            System.out.print("Por favor ingrese una cadena de 2 a 5 caracteres: ");
            palabra = sc.nextLine();

            if (palabra.length() > 5) {
                System.out.println("Tiene que ser de maximo 5 caracteres!!!!!");
            } else if (palabra.length() < 2) {
                System.out.println("Tiene que ser de minimo 2 caracteres!!!!!");
            } else if (palabra.equals("&&&&&")) {
                break;
            } else {
                if (palabra.substring(0, 1).equalsIgnoreCase("X") && palabra.substring(palabra.length() - 1, palabra.length()).equalsIgnoreCase("O")) {
                    correctas += 1;
                } else {
                    incorrectas += 1;
                }

            }

        } while (!palabra.equals("&&&&&"));
        
        System.out.println("Palabras correctas: " + correctas + "\nPalabras incorrectas: " + incorrectas);

    }

}
