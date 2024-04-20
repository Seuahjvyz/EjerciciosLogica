import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        int x = 5;

        do {

            System.out.println("\nIngresa que operacion quieres realizar:");
            System.out.println("0: Cerrar programa");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicacion");
            System.out.println("4: Division");
            System.out.println("5: Modulo");
            x = op.nextInt();

            int a, b;

            switch (x) {

                case 1:
                    System.out.println("\nSuma");
                    System.out.println("Ingresa dos numeros: ");
                    a = op.nextInt();
                    b = op.nextInt();
                    System.out.print("\nEl resultado es: ");
                    System.out.println(a + b);
                    break;

                case 2:
                    System.out.println("\nResta");
                    System.out.println("Ingresa dos numeros: ");
                    a = op.nextInt();
                    b = op.nextInt();
                    System.out.print("\nEl resultado es: ");
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println("\nMultiplicacion");
                    System.out.println("Ingresa dos numeros: ");
                    a = op.nextInt();
                    b = op.nextInt();
                    System.out.print("\nEl resultado es: ");
                    System.out.println(a * b);
                    break;

                case 4:
                    System.out.println("\nDivision");
                    System.out.println("Ingresa dos numeros: ");
                    a = op.nextInt();
                    b = op.nextInt();
                    System.out.print("\nEl resultado es: ");
                    System.out.println(a / b);
                    break;

                case 5:
                    System.out.println("\nModulo");
                    System.out.println("Ingresa dos numeros: ");
                    a = op.nextInt();
                    b = op.nextInt();
                    System.out.print("\nEl resultado es: ");
                    System.out.println(a % b);
                    break;

                default:

                if (x != 0) {

                    System.out.println("Ingresa un numero valido");
                    
                }

                    break;
            }

        } while (5 >= x  &&  x > 0);

    }
}