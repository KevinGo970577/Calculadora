import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0, num2 = 0, resultado, n;
        double i = 1;
        int opcion;
        boolean Salir = false;
        boolean repeticion = false;

        do {
            System.out.println("\tMENÚ");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Exponente");
            System.out.println("6) Porcentaje");

            System.out.print("Digite su opcion: \n>> ");
            opcion = teclado.nextInt();
            do switch (opcion) {
                case 1:
                    System.out.println("Ingreso a la opcion de suma");
                    System.out.print("Ingrese el primer numero: ");
                    num1 = teclado.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = teclado.nextInt();
                    resultado = num1 + num2;
                    System.out.println("El resultado es: " + resultado);
                    Salir = true;
                    break;
                case 2:
                    System.out.println("Ingreso a la opcion de resta");
                    System.out.print("Ingrese el primer numero: ");
                    num1 = teclado.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = teclado.nextInt();
                    resultado = num1 - num2;
                    System.out.println("El resultado es: " + resultado);
                    Salir = true;
                    break;
                case 3:
                    System.out.println("Ingreso a la opcion de multiplicacion");
                    System.out.print("Ingrese el primer numero: ");
                    num1 = teclado.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = teclado.nextInt();
                    resultado = num1 * num2;
                    System.out.println("El resultado es: " + resultado);
                    Salir = true;
                    break;
                case 4:
                    System.out.println("Ingreso a la opcion de division");
                    System.out.print("Ingrese el primer numero: ");
                    num1 = teclado.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = teclado.nextInt();
                    resultado = num1 / num2;
                    System.out.println("El resultado es: " + resultado);
                    Salir = true;
                    break;
                case 5:
                    System.out.println("Ingreso a la opcion de exponente");
                    System.out.print("Ingrese el numero de base");
                    num1 = teclado.nextInt();
                    System.out.print("Ingrese el numero de exponente");
                    num2 = teclado.nextInt();
                    resultado = (int) Math.pow(num1, num2);
                    System.out.println("El resultado es: " + resultado);
                    Salir = true;
                    break;
                case 6:
                    System.out.println("Ingreso a la opcion de porcentaje");
                    System.out.print("Ingrese el numero ");
                    num1 = teclado.nextInt();
                    System.out.print("Ingrese el porcentaje");
                    num2 = teclado.nextInt();
                    resultado = (num1 / 100) * num2;
                    System.out.println("El resultado es: " + resultado);
                    Salir = true;
                    break;
            } while (repeticion);
       } while (!Salir);
    }
}