package Universidad;

import java.util.ArrayList;

//De cada curso
//hay que almacenar el código (un número), el nombre del curso, el número
//de créditos, la carrera a la que pertenece, el número del salón donde se
//imparte, el profesor que la dicta y los estudiantes que la están cursando
//actualmente.
public class Curso {

    private int id;

    private String nombre;

    private int creditos;

    private Carreras carrera;

    private int salon;

    private Profesor profesor;

    private ArrayList<Estudiante> estudiantes;

    public Curso(int pid, String pnombre, int pcreditos, int psalon) {
        id = pid;
        nombre = pnombre;
        creditos = pcreditos;
        salon = psalon;
    }

    public void ingresarCarrera(String pnombreCarrera) throws Exception{
    }

    public void ingresarProfesor(String pnombreProfesor) throws Exception{
    }

    public void ingresarEstudiantes(String pnombreEstudiante) throws Exception{
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public Carreras getCarrera() {
        return carrera;
    }

    public int getSalon() {
        return salon;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
