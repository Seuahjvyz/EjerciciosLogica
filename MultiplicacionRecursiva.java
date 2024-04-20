import java.util.Scanner;

public class MultiplicacionRecursiva{
    public static void main(String[] args) {
        
        Scanner mr = new Scanner(System.in);

        int x;

        do{

        System.out.println("Ingresa 0: Cerrar programa");
        System.out.println("Ingresa 1: Realizar multiplicacion");
        x = mr.nextInt();

        if (x == 1){

            float a, b;

            System.out.println("Ingresa dos numeros: ");
            a = mr.nextFloat();
            b = mr.nextFloat();

            System.out.println("El resultado es: ");
            System.out.println(a*b);
        }
    
        }while(x == 1);
    }

}