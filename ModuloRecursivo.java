import java.util.Scanner;

public class ModuloRecursivo {
    public static void main(String[] args) {
        
        Scanner mr = new Scanner(System.in);

        int x;

        do{

            System.out.println("Ingresa 0: Cerra programa");
            System.out.println("Ingresa 1: Realizar modulo");
            x = mr.nextInt();

            if (x == 1) {

               int a, b;

                System.out.println("Ingresa dos numeros: ");
                a = mr.nextInt();
                b = mr.nextInt();

                System.out.println("El resultado es: ");
                System.out.println(a % b);
                
            }

        }while(x == 1);
    }
}