import java.util.Scanner;

public class NumerosIguales {
    
    public static void main(String[] args) {

        Scanner ni = new Scanner(System.in);

        int x;

        do {
            System.out.println("\nIngresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Determinar si dos numeros son iguales");

            x = ni.nextInt();

            if (x == 1) {

                int a, b;

                System.out.println("\nIngresa el primer numero: ");
                a = ni.nextInt();

                System.out.println("Ingresa el segundo numero:");
                b = ni.nextInt();

                if (a == b) {

                    
                    System.out.println("\n" + a + " es igual que " + b);
                } else {

                    System.out.println("\n" + a + " no es igual que " + b);

                }

            }

        } while (x == 1);

    }
}