import java.util.Scanner;

public class SumaRecursiva {
    public static void main(String[] args) {
        
        Scanner sr = new Scanner (System.in);

        int x;

        do{

            System.out.println("Ingresa 0: Cerrar programa ");
            System.out.println("Ingresa 1: Realizar suma");
            x = sr.nextInt();

            if (x == 1) {

            float a, b;

            System.out.println("Ingresa dos numeros: ");
            a = sr.nextFloat();
            b = sr.nextFloat();

            System.out.println("El resultado es: ");
            System.out.println(a+b);

            }

        } while (x == 1);
    }
}