package Tienda;

import java.util.ArrayList;

class Tienda {

    //Una tienda (de la que guardamos el nombre, la dirección y el teléfono) ofrece 4 productos. De cada uno de estos productos queremos almacenar un  código  numérico,
    // el  nombre,  el  tipo  del  producto  (que  puede  ser LACTEO, CÁRNICO, FRUTA o ENLATADO),
    // la fecha de expiración, el nombre del fabricante, la cantidad en inventario y el precio unitario.

    /**
     * Indica el año.
     */
    private String nombre;
    /**
     * Indica el mes.
     */
    private String direccion;
    /**
     * Indica el dia.
     */
    private String telefono;
    /**
     * Colección de productos
     */
    private ArrayList<Productos> producto;


    public Tienda(String pnombre, String pdireccion, String ptelefono) {
        nombre = pnombre;
        direccion = pdireccion;
        telefono = ptelefono;
        producto = new ArrayList<>();
    }

    public void ingresarProducto(int id, String nombreProducto, String tipo, String expiracion, String fabricante, int cantidadInventario, int precioUnidad) throws Exception{

        boolean encontrado = false;
        for (int i = 0; i < producto.size(); i++) {
            Productos productos = producto.get(i);
            if (productos.darId() == id) {
                encontrado = true;
            }
            if(encontrado){
                throw new Exception("Ese producto ya existe");
            }
        }

        producto.add(new Productos(id, nombreProducto, tipo, expiracion, fabricante, cantidadInventario, precioUnidad));
    }
}