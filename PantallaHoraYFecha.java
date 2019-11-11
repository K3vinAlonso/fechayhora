
/**
 * Creamos una clase nueva para que salga la hora y la fecha" 
 */
public class PantallaHoraYFecha
{
    private PantallaDosDigitos dia;
    private PantallaDosDigitos mes;
    private PantallaDosDigitos ano;
    private PantallaDosDigitos hora;
    private PantallaDosDigitos minutos;
    
    /**
     * Constructor for objects of class PantallaHoraYFecha
     */
    public PantallaHoraYFecha()
    {
        dia = new PantallaDosDigitos (1,31);
        mes = new PantallaDosDigitos (1,13);
        ano = new PantallaDosDigitos (1,99);
        hora = new PantallaDosDigitos (0,24);
        minutos = new PantallaDosDigitos (0,60);
    }
    
    /**
     * Método para obtener un String de 14 caracteres que contenga la fecha y
     * hora
     */
    public String getFechaYHora ()
    {
        return hora.getTextoDeLaPantalla () + ":" + minutos.getTextoDeLaPantalla () + "-" + dia.getTextoDeLaPantalla () + "-" 
        + mes.getTextoDeLaPantalla () + "-" + ano.getTextoDeLaPantalla (); 
    }
    
    /**
     * Método para avanzar un minuto la hora
     */
    public void avanzarMinuto ()
    {
     minutos.incrementaValorAlmacenado ();
     
     if (minutos.getValorAlmacenado () == 0) {
        hora.incrementaValorAlmacenado ();
        if (hora.getValorAlmacenado () == 0) {
            dia.incrementaValorAlmacenado ();
            if (dia.getValorAlmacenado () == 1) {
                mes.incrementaValorAlmacenado ();
                if (mes.getValorAlmacenado () == 1) {
                    ano. incrementaValorAlmacenado ();
                }
            }
        }
     }
    }
}
