package Arrays_Unidimensionales;
/* Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros
aleatorios entre 1 y 10. Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.*/
import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creamos array con 100 números [1, 10]
        int[] array100 = new int[100];
        for(int i = 0; i < array100.length; i++)
        {
            array100[i] = (int) (1 + Math.random() * 10);
        }

        //Pedimos valor N al usuario
        System.out.print("Introduce valor N a buscar: ");
        double n = sc.nextInt();

        //Mostramos las posiciones en las que aparece N
        System.out.print("Posiciones donde aparece N:");
        for (int i = 0; i < array100.length; i++)
        {
            if(array100[i] == n) {
                System.out.print(" " + i);
            }
        }
    }
}

