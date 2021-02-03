package Universidad;
import java.util.ArrayList;
    //Un profesor es una persona de la que tenemos que
    //guardar también la profesión, la nacionalidad, y el sueldo. Un profesor
    //pertenece a una sola facultad

public class Profesor extends Persona{

    private String profesion;

    private String nacionalidad;

    private double sueldo;

    private Facultades facultad;

    public Profesor(String pnombre, String pcedula, String pfechaNacimiento, String pciudad, String pdepartamento, String ppais,
                    String pprofesion, String pnacionalidad, double psueldo) {
        super(pnombre, pcedula, pfechaNacimiento, pciudad, pdepartamento, ppais);
        profesion = pprofesion;
        nacionalidad = pnacionalidad;
        sueldo = psueldo;
    }

    public void ingresarFacultad(String pnombreFacultad) throws Exception{
    }

    public String darProfesion() {
        return profesion;
    }

    public String darNacionalidad() {
        return nacionalidad;
    }

    public double darSueldo() {
        return sueldo;
    }

    public Facultades darFacultad() {
        return facultad;
    }

}
