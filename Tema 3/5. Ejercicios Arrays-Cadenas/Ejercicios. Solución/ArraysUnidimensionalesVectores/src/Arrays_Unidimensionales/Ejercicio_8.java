package Arrays_Unidimensionales;
/*Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y
1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por último,
mostrará cuántos valores del array son igual o superiores a R.
 */


import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Creamos array con 100 números [0.0, 1.0]
        double[] array100 = new double[100];
        for (int i = 0; i < array100.length; i++) {
            array100[i] = Math.random();
        }
        //Pedimos valor R al usuario
        System.out.print("Introduce un número real de 0.0 a 1.0: ");
        double r = sc.nextDouble();

        //Calculamos cuantos números son mayores o iguales a R
        int numMI = 0;
        for (int i = 0; i < array100.length; i++) {
            if (array100[i] >= r) {
                numMI++;
            }
        }
        System.out.println("Cantidad de números mayores o iguales: " + numMI);
    }
}