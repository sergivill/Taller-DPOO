package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	
	public Tiquete (String codigo, Vuelo vuelo, int tarifa)
	{
		this.codigo=codigo;
		this.vuelo=vuelo;
		this.tarifa=tarifa;	
	}
	public Vuelo getvuelo()
	{
		return this.vuelo;
	}
	public String getcodigo()
	{
		return this.codigo;
	}
	public int gettarifa()
	{
		return this.tarifa;
	}
	public void marcarComoUsado()
	{
		
	}
	
	public boolean esUsado()
	{
		return this.usado;
	}


}
