package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    // TODO completar
	private String horasalida;
	private String horallegada;
	private String codigoruta;
	private Aeropuerto destino;
	private Aeropuerto origen;


    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
	public Ruta(Aeropuerto origen,Aeropuerto destino,String codigoruta,String horallegada,String horasalida)
	{
		this.origen=origen;
		this.destino=destino;
		this.codigoruta=codigoruta;
		this.horallegada=horallegada;
		this.horasalida=horasalida;
		
	}
	
	public Aeropuerto getOrigen()
	{
		return this.origen;
	}
	
	public Aeropuerto getDestino()
	{
		return this.destino;
	}
	
	public String getCodigoruta()
	{
		return this.codigoruta;
	}
	
	public String gethorasalida()
	{
		return this.horasalida;
	}
	
	public String gethorallegada()
	{
		return this.horallegada;
	}
	
	public int getDuracion()
	{
		

	}
	
	
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}
