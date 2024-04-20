import java.util.Scanner;

public class NumerosEnBucle {
    public static void main(String[] args) {

        Scanner neb = new Scanner(System.in);

        int x;

        do {

            System.out.println("\nIngresa 0: Cerra programa");
            System.out.println("Ingresa 1: Mostrar del 0 hasta el numero que se pida");
            x = neb.nextInt();

            if (x == 1) {

                int a;

                System.out.println("Ingresa hasta el numero que quieres que se imprima");
                a = neb.nextInt();
                System.out.println("\n");

                if (a > 0) {

                    for (int i = 0; a >= i; ++i) {

                        System.out.println(i);

                    }
                }

                else if (a < 0) {

                    for (int i = 0; a <= i; --i) {

                        System.out.println(i);

                    }

                }

            }

        } while (x == 1);

    }
}