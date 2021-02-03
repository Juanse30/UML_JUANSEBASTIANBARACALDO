package Universidad;

import java.util.ArrayList;

class Universidad {

    //Una Universidad (de la que nos interesa su nombre, nombre del rector y
    //nombre de la ciudad donde funciona) guarda información de sus
    //facultades.


    private String nombre;

    private String nombreRector;

    private String ciudad;

    private ArrayList<Facultades> facultades;

    public Universidad(String pnombre, String pnombreRector, String pciudad) {
        nombre = pnombre;
        nombreRector = pnombreRector;
        ciudad = pciudad;
        facultades = new ArrayList<>();
    }

    public void ingresarFacultades(String pnombreFacultad) throws Exception{
    }

    public String darNombre() {
        return nombre;
    }

    public String darNombreRector() {
        return nombreRector;
    }

    public String darCiudad() {
        return ciudad;
    }

    public ArrayList<Facultades> darFacultades() {
        return facultades;
    }
}