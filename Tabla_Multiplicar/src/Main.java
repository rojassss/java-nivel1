//Tabla de multiplicar con for, y la misma con while leyendo el número con Scanner.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        while (numero <= 0) {
        System.out.println("Ingrese un numero para conocer su tabla de multiplicacion: ");
        numero = scanner.nextInt();

        //TABLA CON FOR
        if (numero > 0) {
            System.out.println("TABLA CON FOR: ");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + i * numero);
            }


            System.out.println("");
            System.out.println("TABLA CON WHILE");
            //TABLA CON WHILE
            int contador = 1;
            while (contador <= 10) {
                System.out.println(numero + " x " + contador + " = " + contador * numero);
                contador++;
            }
        }
        else System.out.println("El numero ingresado debe ser mayor que 0");

        }
    }
}