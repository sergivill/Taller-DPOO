package uniandes.dpoo.aerolinea.modelo;

public class Avion 
{
private String nombre;
private int capacidad;
public Avion (String nombre, int capacidad)
{
	this.nombre=nombre;
	this.capacidad=capacidad;
}
public String getnombre()
{
	return this.nombre;
}
public int getCapacidad()
{
	return this.capacidad;
}
}
