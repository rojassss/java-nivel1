
public class Main {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                if (contador > 0) {
                    System.out.print(", ");
                }
                System.out.print(i);
                contador++;
            }
        }
        System.out.print("\nLa cantidad de numeros primos entre 1 y 100 es de: " +contador);


    }

    public static boolean esPrimo(int n) {
        if (n <= 0 || n == 1) {
            return false;
        }
        else if (n > 2 && n % 2 == 0) {
            return false;
        }
        int cont = 0;
        for (int i = 1; i < n+1; i++){

            if (n % i == 0) {
                cont++;
                if (cont > 2) {
                    return false;
                }
            }
        }
        return true;
    }
}