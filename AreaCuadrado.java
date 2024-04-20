import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) {

        Scanner ac = new Scanner(System.in);

        int x;  

        do {
            System.out.println("\nIngresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Calcular area del cuadrado");
            x = ac.nextInt();

            if (x == 1) {

                int l;

                System.out.println("\nIngresa el valor del lado del cuadrado");
                l = ac.nextInt();

                System.out.print("El resultado es: ");
                System.out.println(Math.pow(l, 2));

            }

        } while (x == 1);

    }

}