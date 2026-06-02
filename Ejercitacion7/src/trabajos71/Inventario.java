package trabajos71;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> listaProductos;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto prod) {
        this.listaProductos.add(prod);
    }

    public void mostrarInventario() {
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(listaProductos.get(i).toString());
        }
    }

    public int obtenerTotalProductos() {
        return this.listaProductos.size();
    }
}