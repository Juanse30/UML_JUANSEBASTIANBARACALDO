package Universidad;

//Una persona tiene cédula, nombre, fecha de nacimiento y
//lugar de nacimiento (ciudad, departamento, pais).

import java.util.ArrayList;

public class Persona {

    private String nombre;

    private String cedula;

    private String fechaNacimiento;

    private String ciudad;

    private String departamento;

    private String pais;

    public Persona(String pnombre, String pcedula, String pfechaNacimiento, String pciudad, String pdepartamento, String ppais) {
        nombre = pnombre;
        cedula = pcedula;
        fechaNacimiento = pfechaNacimiento;
        ciudad = pciudad;
        departamento = pdepartamento;
        pais = ppais;
    }

    public String darNombrePersona() {
        return nombre;
    }

    public String darCedula() {
        return cedula;
    }

    public String darFechaNacimiento() {
        return fechaNacimiento;
    }

    public String darlugarNacimiento() {
        return ciudad + "/" + departamento + "/" + pais;
    }



}
