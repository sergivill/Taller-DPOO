package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;


public class Vuelo {
	private String fecha;
	private Avion avion;
	private Ruta ruta;
	private List<Tiquete> tiquetes;
	public Vuelo (Ruta ruta, String fecha, Avion avion)
	{
		this.ruta=ruta;
		this.fecha=fecha;
		this.avion=avion;
		this.tiquetes=new LinkedList<Tiquete>();
	}
	public Ruta getruta()
	{
		return this.ruta;
	}
	public Avion getavion()
	{
		return this.avion;
	}
	public String getfecha()
	{
		return this.fecha;
	}
	public Collection<Tiquete> getTiquetes()
	{
		return this.tiquetes;
	}
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad)
	{
		return 3;
	}
	public boolean equals(Object obj)
	{
		return 1;
	}


}
