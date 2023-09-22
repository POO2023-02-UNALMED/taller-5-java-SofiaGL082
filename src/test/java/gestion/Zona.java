package gestion;

import java.util.ArrayList;
import java.util.List;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private static Zoologico zoo;
	private List<Animal> animales = new ArrayList<Animal>();
	
	//Constructor vacio
	public Zona() {
		
	}
	
	//Constructor atributos
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		Zona.zoo = zoo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setZoo(Zoologico zoo) {
		Zona.zoo = zoo;
	}
	public static Zoologico getZoo() {
		return zoo;
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
		
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}

}
