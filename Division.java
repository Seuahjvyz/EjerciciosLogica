import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        
        Scanner div = new Scanner (System.in);

        int a, b;

        System.out.println("Division");

        System.out.println("Ingresa dos numeros : ");
        a = div.nextInt();
        b = div.nextInt();

        System.out.println("El resultado de la division es: ");
        System.out.println(a/b);
    }
}