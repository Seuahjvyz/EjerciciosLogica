import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {

        Scanner sum = new Scanner(System.in);

        int a, b;

        System.out.println("Suma");
        System.out.println("Ingresa dos numeros enteros: ");
        a = sum.nextInt();
        b = sum.nextInt();

        System.out.println("El resultado de la suma es: ");
        System.out.println(a + b);

    }
}