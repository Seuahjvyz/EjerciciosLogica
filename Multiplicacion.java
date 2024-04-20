import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        
        Scanner mul = new Scanner (System.in);

        int a, b;

        System.out.println("Multiplicacion");

        System.out.println("Ingresa dos numeros enteros: ");
        a = mul.nextInt();
        b = mul.nextInt();

        System.out.println("El resultado de la multiplicacion es: ");
        System.out.println(a*b);

    }
}
    
