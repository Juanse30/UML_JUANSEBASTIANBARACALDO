class Reloj {

    //Un Reloj es una clase que almacena la hora, los minutos y los segundos

    /**
     * Indica el hora.
     */
    private int hora;
    /**
     * Indica el minutos.
     */
    private int minutos;
    /**
     * Indica el segundos.
     */
    private int segundos;

    public Reloj(int phora, int pminutos, int psegundos) {
        hora = phora;
        minutos = pminutos;
        segundos = psegundos;
    }

    public String darHora(){
        return hora+":"+minutos+":"+segundos;
    }
}