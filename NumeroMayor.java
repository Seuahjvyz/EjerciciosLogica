import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

        Scanner nm = new Scanner(System.in);

        int x;

        do {

            System.out.println("\nIngresa 0: Cerra programa");
            System.out.println("Ingresa 1: Determinar que numero es mayor");
            x = nm.nextInt();

            if (x == 1) {

                int a, b;

               
                System.out.println("\nIngresa el primer numero: ");
                a = nm.nextInt();

                System.out.println("Ingresa el segundo numero:");
                b = nm.nextInt();

                if (a > b) {

                    System.out.println("\n" + a + " es mayor que " + b);

                } else {

                    System.out.println("\n" + b + " es mayor que " + a);

                }

            }

        } while (x == 1);

    }
}