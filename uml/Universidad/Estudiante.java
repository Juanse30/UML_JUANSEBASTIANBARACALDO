package Universidad;

//Los estudiantes son personas de las que
//tenemos que almacenar el semestre en que se encuentra, la carrera que
//está cursando y la fecha en que ingresó a la universidad.

public class Estudiante extends Persona {

    private String semestre;

    private String carrera;

    private String fechaIngreso;

    private Universidad universidad;

    public Estudiante(String pnombre, String pcedula, String pfechaNacimiento, String pciudad, String pdepartamento, String ppais,
                      String psemestre, String pcarrera, String pfechaIngreso) {
        super(pnombre, pcedula, pfechaNacimiento, pciudad, pdepartamento, ppais);
        semestre = psemestre;
        carrera = pcarrera;
        fechaIngreso = pfechaIngreso;
    }

    public void ingresarUniversidad(String pnombreUniversidad) throws Exception{
    }

    public String darSemestre() {
        return semestre;
    }

    public String darCarrera() {
        return carrera;
    }

    public String darFechaIngreso() {
        return fechaIngreso;
    }

    public Universidad darUniversidad() {
        return universidad;
    }
}
