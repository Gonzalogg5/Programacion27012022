/* Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
   separados por espacios. */

public class Arrays {
    public static void main(String[] args) {
        //Creamos un array para guardar los números aleatorios.
        int[] numAleatorios = new int[20];

        //Utilizamos un bucle for para generar cada número aleatorio asta 20.
        for (int i = 0; i < 20; i++) {
            numAleatorios[i] = (int) (Math.random() * 11); /* el número que genera es entre 0 y 10, y se
                                                            pone 11 porque cuanta 1 menos*/
        }
            //Utilizamos otro bucle  for para mostrar los números por pantalla.
            for (int i = 0; i < 20; i++) {
                System.out.print(numAleatorios[i] + " ");
            }
    }
}