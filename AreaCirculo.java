import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {

        Scanner ac = new Scanner(System.in);

        int x;

        do {
            System.out.println("\nIngresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Calcular area del circulo");
            x = ac.nextInt();

            if (x == 1) {

                double r;

                System.out.println("\nIngresa el valor del radio del circulo:");
                r = ac.nextInt();

                r = Math.pow(r, 2); // base, exponente

                System.out.print("El resultado es: ");
                System.out.println(Math.PI * r);

            } 

        } while (x == 1);

    }

}