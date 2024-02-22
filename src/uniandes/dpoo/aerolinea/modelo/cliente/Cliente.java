package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.LinkedList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Avion;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	private List<Tiquete> TiquetesSinUsar;
	private List<Tiquete> TiquetesUsados;
	
	public Cliente()
	{
		TiquetesSinUsar = new LinkedList<Tiquete>( );
		TiquetesUsados = new LinkedList<Tiquete>( );
	}
	public String getTipoCliente()
	{
		return "sergio";
	}
	public String getIdentificador()
	{
		return "sergio";
	}
	public void agragartiquete(Tiquete tiquete)
	{
		
	}
	public int calcularValorTotalTiquetes()
	{
		return 3;
	}
	public void usarTiquetes(Vuelo vuelo)
	{
		
	}
}
