import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        Scanner at = new Scanner(System.in);

        int x;

        do {
            System.out.println("\nIngresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Calcular area del triangulo");
            x = at.nextInt();

            if (x == 1) {

                int a, b;

                System.out.println("\nIngresa el valor de la base del triangulo:");
                b = at.nextInt();
                System.out.println("Ingresa el valor de la altura del triangulo:");
                a = at.nextInt();

                System.out.print("El resultado es: ");
                System.out.println((b*a)/2);

            }

        } while (x == 1);

    }

}