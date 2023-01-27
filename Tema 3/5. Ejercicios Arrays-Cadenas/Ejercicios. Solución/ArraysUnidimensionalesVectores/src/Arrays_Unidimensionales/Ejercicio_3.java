/*3. Crea un programa que pida diez números reales por teclado, los almacene
en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
 */

package Arrays_Unidimensionales;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        // Variables
        double[] numeros = new double[10];
        double max = Double.MIN_VALUE; // Mínimo valor double posible
        double min = Double.MAX_VALUE; // Máximo valor double posible

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos 10 numeros y los guardamos en el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("Dame el valor " + i + ": ");
            numeros[i] = in.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            if(numeros[i]>max){
                max=numeros[i];
            }

            if(numeros[i]<min){
                min=numeros[i];
            }
        }

        for (Double n: numeros) {
            if(n>max) max=n;

            if(n<min) min=n;
        }

        System.out.println("max en bucle"  + max);

        System.out.println("min en bucle"  + min);

        // Recorremos el vector buscando el máximo y el mínimo
        for (int i = 0; i < 10; i++) {
            max = Math.max(numeros[i], max); // puede hacerse con un if-else
            min = Math.min(numeros[i], min); // puede hacerse con un if-else
        }

        // Mostramos máximo y mínimo
        System.out.println("MÁXIMO Math: " + max);
        System.out.println("MÍNIMO Math: " + min);



        //Método estático o no que calcule el máximo y el mínimo y lo
        //devuelva al main para que este los visualice

    }



}