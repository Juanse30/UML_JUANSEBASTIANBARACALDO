package Tienda;
class Productos {

    //De cada uno de estos productos queremos almacenar un  código  numérico,
    // el  nombre,  el  TIPO()  del  producto, la fecha de expiración,
    // el nombre del fabricante, la cantidad en inventario y el precio unitario.

    /**
     * LACTEO
     */
    public static final String LACTEO = "LACTEO";
    /**
     * CÁRNICO
     */
    public static final String CARNICO = "CARNICO";
    /**
     * FRUTA
     */
    public static final String FRUTA = "FRUTA";
    /**
     * ENLATADO
     */
    public static final String ENLATADO = "ENLATADO";

    /**
     * Indica el id.
     */
    private int id;
    /**
     * Indica el nombreProducto.
     */
    private String nombreProducto;
    /**
     * Indica el tipo.
     */
    private String tipo ;
    /**
     * Indica la expiracion.
     */
    private String expiracion;
    /**
     * Indica el fabricante.
     */
    private String fabricante;
    /**
     * Indica la cantidadInventario.
     */
    private int cantidadInventario;
    /**
     * Indica el precioUnidad.
     */
    private int precioUnidad;


    public Productos(int pid, String pnombreProducto, String ptipo, String pexpiracion, String pfabricante, int pcantidadInventario, int pprecioUnidad) {
        id = pid;
        nombreProducto = pnombreProducto;
        tipo = ptipo;
        expiracion = pexpiracion;
        fabricante = pfabricante;
        cantidadInventario = pcantidadInventario;
        precioUnidad = pprecioUnidad;
    }

    public int darId() {
        return id;
    }

    public String darNombreProducto() {
        return nombreProducto;
    }

    public String darTipo() {
        return tipo;
    }

    public String darExpiracion() {
        return expiracion;
    }

    public String darFabricante() {
        return fabricante;
    }

    public int darCantidadInventario() {
        return cantidadInventario;
    }

    public int darPrecioUnidad() {
        return precioUnidad;
    }
}