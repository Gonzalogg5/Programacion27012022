package Arrays_Unidimensionales;

import java.util.Scanner;

public class Ejercicio_3_v2 {

    public static double maxClase=Double.MIN_VALUE;
    public static double minClase=Double.MAX_VALUE;

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

        System.out.println("max en bucle for"  + max);

        System.out.println("min en bucle for"  + min);

        for (Double n: numeros) {
            if(n>max) max=n;

            if(n<min) min=n;
        }

        System.out.println("max en bucle foreach"  + max);

        System.out.println("min en bucle foreach"  + min);

        // Recorremos el vector buscando el máximo y el mínimo
        for (int i = 0; i < 10; i++) {
            max = Math.max(numeros[i], max); // puede hacerse con un if-else
            min = Math.min(numeros[i], min); // puede hacerse con un if-else
        }

        // Mostramos máximo y mínimo
        System.out.println("MÁXIMO Math: " + max);
        System.out.println("MÍNIMO Math: " + min);



        //Método estático o no que calcule el máximo y el mínimo y lo
        //devuelva al main para que éste los visualice

        //Método estático
        maxMin(numeros);
        System.out.println("MÁXIMO Clase Estatico: " + maxClase);
        System.out.println("MÍNIMO Clase Estatico: " + minClase);

        //Método NO estático
        Ejercicio_3_v2 ej3 = new Ejercicio_3_v2();
        ej3.maxMin_instancia(numeros);

        // Mostramos máximo y mínimo
        System.out.println("MÁXIMO Clase NO static: " + maxClase);
        System.out.println("MÍNIMO Clase NO static: " + minClase);

        // Mostramos máximo y mínimo del array
        double [] arrayResultado = new double[2];

        arrayResultado= ej3.maxMin_array(numeros);
        System.out.println("MÍNIMO array return: " + arrayResultado[0]);
        System.out.println("MÁXIMO array return: " + arrayResultado[1]);

        ej3.maxMin_array_param(numeros,arrayResultado);

        System.out.println("MÍNIMO array param: " + arrayResultado[0]);
        System.out.println("MÁXIMO array param: " + arrayResultado[1]);
    }

    //Método de Clase
    public static void maxMin(double [] numeros){
        for (int i = 0; i < 10; i++) {
            if(numeros[i]>maxClase){
                maxClase=numeros[i];
            }

            if(numeros[i]<minClase){
                minClase=numeros[i];
            }
        }

    }

    //Método de Instancia
    public void maxMin_instancia(double [] numeros){
        for (int i = 0; i < 10; i++) {
            if(numeros[i]>maxClase){
                maxClase=numeros[i];
            }

            if(numeros[i]<minClase){
                minClase=numeros[i];
            }
        }

    }

    public double [] maxMin_array(double [] numeros){
        for (int i = 0; i < 10; i++) {
            if(numeros[i]>maxClase){
                maxClase=numeros[i];
            }

            if(numeros[i]<minClase){
                minClase=numeros[i];
            }
        }
        double [] resultado = new double[2];
        resultado[0]=minClase;
        resultado[1]=maxClase;

        return resultado;
    }

    public void maxMin_array_param(double [] numeros,double [] resultado){
        for (int i = 0; i < 10; i++) {
            if(numeros[i]>maxClase){
                maxClase=numeros[i];
            }

            if(numeros[i]<minClase){
                minClase=numeros[i];
            }
        }
        resultado[0]=minClase;
        resultado[1]=maxClase;
    }

}
