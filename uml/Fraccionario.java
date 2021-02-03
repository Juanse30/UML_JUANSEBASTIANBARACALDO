class Fraccionario {

    //La clase Fraccionario: debemos poder almacenar el numerador y el
    //denominador del Fraccionario

    /**
     * Indica el numerador.
     */
    private int numerador;
    /**
     * Indica el denominador.
     */
    private int denominador;

    public Fraccionario(int pnumerador, int pdenominador) {
        numerador = pnumerador;
        denominador = pdenominador;
    }

    public int darFraccion(){
        return numerador/denominador;
    }
}