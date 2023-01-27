package Arrays_Avanzados;

/*1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25 y
luego muestre la matriz por pantalla.*/

public class Ejercicio_1 {

    public static void main(String[] args) {

        int x = 1;

        int[][] num = new int[5][5];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                num[i][j] = x++;
                System.out.printf("%4d", num[i][j]);
            }
            System.out.println("");
        }
    }
}