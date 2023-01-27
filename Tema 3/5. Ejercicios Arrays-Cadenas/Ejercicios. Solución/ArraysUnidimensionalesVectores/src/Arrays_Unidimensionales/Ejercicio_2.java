/*2. Crea un programa que pida diez números reales por teclado, los almacene en
un array, y luego muestre la suma de todos los valores.
 */

package Arrays_Unidimensionales;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        // Variables
        double[] numeros = new double[10];
        double total = 0;

        // Creamos Scanner
        Scanner reader = new Scanner(System.in);

        // Pedimos 10 numeros y los guardamos en el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("Dame el valor " + i + ": ");
            numeros[i] = reader.nextDouble();
        }
        // Calculamos la suma total
        for (int i = 0; i < 10; i++) {
            total += numeros[i];
        }
        // Mostramos suma total
        System.out.println("TOTAL: " + total);

        sumaNumeros(numeros);
    }

    public static void sumaNumeros( double[] vector){
        double total = 0;
        // Calculamos la suma total
        for (double n: vector) {
            total += n;
        }

        // Mostramos suma total
        System.out.println("TOTAL dentro métodoEstático: " + total);
    }

}
