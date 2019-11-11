
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

}
