package Universidad;


    //De una carrera necesitamos guardar el
    //nombre, el número de créditos totales, el número de semestres que dura
    //la carrera, el nivel de la carrera (PREGRADO o POSTGRADO) y la
    //facultad a la que pertenece.


public class Carreras {

    public static final String PREGRADO = "PREGRADO";

    public static final String POSTGRADO = "POSTGRADO";

    private String nombre;

    private int creditos;

    private int nSemestresCarrera;

    private String nivelCarrera;

    private Facultades facultad;

    public Carreras(String pnombre, int pcreditos, int pnSemestresCarrera, String pnivelCarrera) {
        nombre = pnombre;
        creditos = pcreditos;
        nSemestresCarrera = pnSemestresCarrera;
        nivelCarrera = pnivelCarrera;
    }

    public String darNombre() {
        return nombre;
    }

    public int darCreditos() {
        return creditos;
    }

    public int darnSemestresCarrera() {
        return nSemestresCarrera;
    }

    public String darNivelCarrera() {
        return nivelCarrera;
    }

    public Facultades darFacultad() {
        return facultad;
    }

}
