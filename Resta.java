import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {

        Scanner res = new Scanner(System.in);

        int a, b;

        System.out.println("Resta");

        System.out.println("Ingresa dos numeros enteros: ");
        a = res.nextInt();
        b = res.nextInt();

        System.out.println("El resultado de la resta es: ");
        System.out.println(a - b);

    }

}