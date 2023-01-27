package Arrays_Unidimensionales;

/*Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
escriba M en todas sus posiciones y lo muestre por pantalla.*/

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tamaño del vector: ");
        int n = sc.nextInt();
        System.out.println("Valor a introducir: ");
        int m = sc.nextInt();

        //Creamos el array e inserta m en todas sus posiciones
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = m;
        }
        //Mostramos el array
        System.out.print("Array: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}