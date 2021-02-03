class Proyectil {

    //Un proyectil es una clase que permite trabajar la velocidad a la que es
    //disparado el elemento, así como el ángulo con el que sale disparado.

    /**
     * Indica la velocidad.
     */
    private int velocidad;
    /**
     * Indica el pangulo.
     */
    private int angulo;
    /**
     * Indica la gravedad.
     */
    public static final double GRAVEDAD = 9.8;


    public Proyectil(int pvelocidad, int pangulo) {
        velocidad = pvelocidad;
        angulo = pangulo;
    }

    public Double darAlturaMax(){
    return Math.pow(velocidad,2) * Math.pow(Math.sin(angulo),2) / GRAVEDAD * 2;
    }
    public Double darAlcanceMax(){
        return (Math.pow(velocidad,2) * Math.pow(Math.sin(2*angulo),2)) / GRAVEDAD;
    }
    public Double darTiempoVuelo(){
        return (2 * velocidad * Math.sin(angulo)) / GRAVEDAD;
    }
}