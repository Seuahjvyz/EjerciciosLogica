import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {

        Scanner mod = new Scanner(System.in);

        int a, b;

        System.out.println("Modulo"); /*Residuo de una disvision*/

        System.out.println("Ingresa dos numeros: ");
        a = mod.nextInt();
        b = mod.nextInt();

        System.out.println("El resultado es: ");
        System.out.println(a % b);
    }

}