import java.util.Scanner;

public class NumerosDescendentes {
    public static void main(String[] args) {

        Scanner nd = new Scanner(System.in);

        int x;

        do {

            System.out.println("\nIngresa 0: Cerra programa");
            System.out.println("Ingresa 1: Mostrar ordenados los numeros de mayor a menor");
            x = nd.nextInt();

            if (x == 1) {

                int a, b, c;

                System.out.println("\nIngresa tres numeros:");
                a = nd.nextInt();
                b = nd.nextInt();
                c = nd.nextInt();

                if (a > b && b > c) {

                    System.out.println("\n"+ a + ", " + b + ", " + c);

                }

                else if (a > c && c > b) {

                    System.out.println("\n"+a + ", " + c + ", " + b);

                }

                else if (b > a && a > c) {

                    System.out.println("\n"+b + ", " + a + ", " + c);

                }

                else if (b > c && c > a) {

                    System.out.println("\n"+b + ", " + c + ", " + a);

                }

                else if (c > a && a > b) {

                    System.out.println("\n"+c + ", " + a + ", " + b);

                }

                else if (c > b && b > a) {

                    System.out.println("\n"+c + ", " + b + ", " + a);

                }

            }

        } while (x == 1);

    }
}