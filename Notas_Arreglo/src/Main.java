import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] listaNotas = new Double[10];
        for (int i = 0; i < listaNotas.length; i++) {
            System.out.println("Ingrese la nota " + (i+1) + ": ");
            double nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 10) {
                listaNotas[i] = nota;
            }else  {
                System.out.println("El numero ingresado no es valido. Ingrese una nota entre 0 y 10.");
                i--;
            }
        }

        for (int i = 0; i < listaNotas.length; i++) {
            System.out.println(listaNotas[i]);

        }

        System.out.println("La nota mas alta fue: " + notaMayor(listaNotas));
        System.out.println("La nota mas baja fue: " + notaMenor(listaNotas));
        System.out.println("La nota promedio fue: " + notaPromedio(listaNotas));
        System.out.println("La cantidad de aprobados fue de: " + cantidadAprobados(listaNotas));


    }
    public static double notaMayor(Double[] listaNotas) {
        double masAlto = 0;
        for (int i = 0; i < listaNotas.length; i++ ) {
            if (listaNotas[i] > masAlto) {
                masAlto = listaNotas[i];
            }
        }
        return masAlto;
    }

    public static double notaMenor(Double[] listaNotas) {
        double masBajo = 10;
        for (int i = 0; i < listaNotas.length; i++ ) {
            if (listaNotas[i] < masBajo) {
                masBajo = listaNotas[i];
            }
        }
        return masBajo;
    }

    public static double notaPromedio(Double[] listaNotas) {
        double notaTotal = 0;
        for (int i = 0; i < listaNotas.length; i++ ) {
                notaTotal = listaNotas[i] + notaTotal;
        }
        double notaPromedio = notaTotal / listaNotas.length;
        return notaPromedio;
    }

    public static int cantidadAprobados(Double[] listaNotas) {
        int contador = 0;
        for (int i = 0; i < listaNotas.length; i++ ) {
            if (listaNotas[i] >= 6) {
                contador++;
            }
        }
        return contador;
    }

}

