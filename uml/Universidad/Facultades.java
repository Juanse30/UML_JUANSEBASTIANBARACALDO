package Universidad;

import java.util.ArrayList;

class Facultades {

    //Una facultad tiene un nombre, profesores, estudiantes,
    //carreras y cursos.

    private String nombre;

    private ArrayList<Profesor> profesores;

    private ArrayList<Estudiante> estudiantes;

    private ArrayList<Carreras> carreras;

    private ArrayList<Curso> cursos;

    public Facultades(String pnombre) {
        nombre = pnombre;
        profesores = new ArrayList<>();
        estudiantes = new ArrayList<>();
        carreras = new ArrayList<>();
        cursos = new ArrayList<>();
    }


    public void ingresarProfesores(String pnombreProfesor) throws Exception{
    }

    public void ingresarEstudiantes(String pnombreEstudiante) throws Exception{
    }

    public void ingresarCarrera(String pnombreCarrera) throws Exception{
    }

    public void ingresarCurso(String pnombreCurso) throws Exception{
    }

    public String darNombre() {
        return nombre;
    }

    public ArrayList<Profesor> darProfesores() {
        return profesores;
    }

    public ArrayList<Estudiante> darEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Carreras> darCarreras() {
        return carreras;
    }

    public ArrayList<Curso> darCursos() {
        return cursos;
    }
}