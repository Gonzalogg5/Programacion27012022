package Arrays_Avanzados_2;

/*5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa y detectar si
existe brecha salarial entre ambos. El programa pedirá por teclado la información de N personas distintas
(valor también introducido por teclado).

Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada género.*/

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {

        // Variables
        int n;
        double[][] personas;
        double totalM = 0, totalF = 0;
        double cuantosM = 0, cuantasF = 0;
        double mediaM, mediaF;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos N (nº de personas)
        System.out.print("Dime nº de personas: ");
        n = in.nextInt();

        // Creamos la matriz: Una fila para cada persona
        // En la columna guardamos dos datos: género y sueldo
        personas = new double[n][2];

        // Pedimos los valores de la matriz
        for (int i = 0; i < n; i++) {
            System.out.print("Dime género de persona " + i + " (0 masc / 1 fem): ");
            personas[i][0] = in.nextDouble();
            System.out.print("Dime sueldo de persona " + i + ": ");
            personas[i][1] = in.nextDouble();
        }

        // Recorremos la matriz para calcular el sueldo medio de cada género
        // Contamos cuantas personas de cada género, y sumamos sus sueldos
        for (int i = 0; i < n; i++) {
            // Si es género masculino
            if (personas[i][0] == 0) {
                cuantosM++;
                totalM += personas[i][1];
            }
            // Si es género femenino
            else if (personas[i][0] == 1) {
                cuantasF++;
                totalF += personas[i][1];
            }
        }

        // Calculamos sueldo medio de cada género
        mediaM = totalM / cuantosM;
        mediaF = totalF / cuantasF;

        // Mostramos sueldo medio de cada género
        System.out.println("Sueldo medio género Masculino: " + mediaM);
        System.out.println("Sueldo medio género Femenino : " + mediaF);

    }
}
