import java.util.Scanner;

public class RestaRecursiva {

    public static void main(String[] args) {

        Scanner rr = new Scanner (System.in);

        int x;

        do{

            System.out.println("Ingresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Realizar resta");
            x = rr.nextInt();

            if (x == 1) {

            float a, b;

            System.out.println("Ingresa dos numeros: ");
            a = rr.nextFloat();
            b = rr.nextFloat();

            System.out.println("El resultado es: ");
            System.out.println(a-b);

            }

        }while(x == 1);
        
    }
}