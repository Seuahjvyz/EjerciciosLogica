import java.util.Scanner;

public class ValidarNumero {
    public static void main(String[] args) {

        Scanner vn = new Scanner(System.in);

        int x;

        do {

            System.out.println("\nIngresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Validar si un numero es par o impar");
            x = vn.nextInt();

            int a;

            if (x == 1) {

                System.out.println("\nIngresa un numero:");
                a = vn.nextInt();

                if (a % 2 == 0) {

                    
                    System.out.println("\nEl numero es par");
                }
               
                else {

                    System.out.println("\nEl numero es impar");

                }

            }

        } while (x == 1);
    }
}