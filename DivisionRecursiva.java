import java.util.Scanner;

public class DivisionRecursiva {
    public static void main(String[] args) {

        Scanner dr = new Scanner(System.in);

        int x;

        do {

            System.out.println("Ingresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Realizar division");
            x = dr.nextInt();

            if (x == 1) {

                float a, b;

                System.out.println("Ingresa dos numeros:");
                a = dr.nextFloat();
                b = dr.nextFloat();

                System.out.println("El resultado es: ");
                System.out.println(a / b);

            }

        } while (x == 1);
    }
}