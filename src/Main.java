//EJERCICIO 1: Mayor de tres números y par/impar, usando if/else.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("INGRESE 3 NUMEROS PARA DETERMINAR SI SON PAR O IMPAR Y CUAL DE ELLOS ES EL MAS GRANDE: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        System.out.println("");

        if (a > b && a > c) {
            System.out.println("El numero " + a + " es el mas grande");
        }
        else if (b > a && b > c){
            System.out.println("El numero " + b + " es el mas grande");

        }
        else if (c > b && c > a) {
            System.out.println("El numero " + c + " es el mas grande");
        }

        if (a == b) {
            if (a == c) {
                System.out.println("Los 3 numeros tienen el mismo valor");
            }
            else if (a > c) {
                System.out.println(a + " y " + b + " son mas grandes que " + c);
            }

        }
        else if (a == c){
            if (a == b) {
                System.out.println("Los 3 numeros tienen el mismo valor");
            }
            else if (a > b) {
                System.out.println(a + " y " + c + " son mas grandes que " + b);
            }

        }
        else if (b == c) {
            if (b == a) {
                System.out.println("Los 3 numeros tienen el mismo valor");
            }
            else if (b > a) {
                System.out.println(c + " y " + b + " son mas grandes que " + a);
            }

        }

        System.out.println("");

        if (a % 2 == 0) {
            System.out.println(a + " es par");
        }
        else {
            System.out.println(a + " es impar");
        }


        if (b % 2 == 0) {
            System.out.println(b + " es par");
        }
        else {
            System.out.println(b + " es impar");
        }

        if (c % 2 == 0) {
            System.out.println(c + " es par");
        }
        else {
            System.out.println(c + " es impar");
        }


    }
}

//Practicamos las comparaciones con la estructuras if/else. Mucha repeticion de codigo. Para proximos ejercicios se debera implementar una estructura o logica de codigo mas reduccionista