import java.util.Scanner;

public class NumerosEnBucleDesc {
    public static void main(String[] args) {

        Scanner nebd = new Scanner(System.in);

        int x;

        do {

            System.out.println("\nIngresa 0: Cerra programa");
            System.out.println("Ingresa 1: Mostrar del numero que se pida hasta el 0");
            x = nebd.nextInt();

            if (x == 1) {

                int a;

                System.out.println("Ingresa hasta el numero que quieres que se imprima");
                a = nebd.nextInt();
                System.out.println("\n");

                if (a > 0) {

                    for (int z = a; z >= 0; --z) {

                        System.out.println(z);

                    }
                }

                else if (a < 0) {

                    for (int z = a; z <= 0; ++z) {

                        System.out.println(z);

                    }

                }

            }

        } while (x == 1);

    }
}