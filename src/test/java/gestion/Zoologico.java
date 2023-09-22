package gestion;

import java.util.ArrayList;
import java.util.List;
import zooAnimales.Animal;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList <Zona>();
	
	//Constructor vacio
	public Zoologico() {
		
	}
	
	//Constructor atributos
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getUbicacion() {
		return ubicacion;
	}

	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		return Animal.getTotalAnimales();
	}
	
	public List<Zona> getZona() {
		return zonas;
	}

}
