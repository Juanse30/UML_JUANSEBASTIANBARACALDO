class Fecha {

    //La clase Fecha permite almacenar año, mes y día

    /**
     * Indica el año.
     */
    private int año;
    /**
     * Indica el mes.
     */
    private int mes;
    /**
     * Indica el dia.
     */
    private int dia;


    public Fecha(int paño, int pmes, int pdia) {
        año = paño;
        mes = pmes;
        dia = pdia;
    }

    public String darFecha(){
        return año+"/"+mes+"/"+dia;
    }
}