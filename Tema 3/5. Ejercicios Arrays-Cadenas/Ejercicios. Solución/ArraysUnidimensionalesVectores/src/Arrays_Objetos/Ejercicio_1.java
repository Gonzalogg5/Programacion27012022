package Arrays_Objetos;

/* Crear un array de objetos Producto, que será instancia de una clase que tiene dos atributos
(IdProducto y NombreProducto). Introducir valores en el array y después visualizarlo.*/



public class Ejercicio_1 {
            public static void main(String args[]) {

                Producto[] objeto = new Producto[5];

                Producto p0 = new Producto(26589, "Mandarina");
                Producto p1 = new Producto(26590, "Manzana");
                Producto p2 = new Producto(26591, "Pera");
                Producto p3 = new Producto(26592, "Plátano");
                Producto p4 = new Producto(26593, "Pomelo");

                objeto[0] = p0;
                objeto[1] = p1;
                objeto[2] = p2;
                objeto[3] = p3;
                objeto[4] = p4;

                System.out.println("Objeto Producto 1:");
                objeto[0].display();
                System.out.println("Objeto Producto 2:");
                objeto[1].display();
                System.out.println("Objeto Producto 2:");
                objeto[2].display();
                System.out.println("Objeto Producto 3:");
                objeto[3].display();
                System.out.println("Objeto Producto 4:");
                objeto[4].display();
            }
}
public class Producto {
    private int IdProducto;
    private String NombreProducto;

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int idProducto) {
        IdProducto = idProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }
}
