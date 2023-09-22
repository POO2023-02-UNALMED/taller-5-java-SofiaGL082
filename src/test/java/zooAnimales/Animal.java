package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;
import gestion.Zoologico;

public class Animal {
	private static int totalAnimales = 0;
	private static String nombre;
	private static int edad;
	private static String habitat;
	private static String genero;
	private List<Zona> zona = new ArrayList<Zona>();
	private Zoologico zoo;
	
	//Constructor vacio
	public Animal() {
		totalAnimales++;
		
	}
	
	//Constructor de atributos
	public Animal(String nombre, int edad, String habitat, String genero) {
		Animal.nombre = nombre;
		Animal.edad = edad;
		Animal.habitat = habitat;
		Animal.genero = genero;
		totalAnimales++;
	}
	
	//Metodos get y set para atributos privados

	public void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public static int getTotalAnimales() {
		return Animal.totalAnimales;
	}
	
	public static void setNombre(String nombre) {
		Animal.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public static void setEdad(int edad) {
		Animal.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	
	public static void setHabitat(String habitat) {
		Animal.habitat = habitat;
	}
	public String getHabitat() {
		return habitat;
	}
	
	public static void setGenero(String genero) {
		Animal.genero = genero;
	}
	public String getGenero() {
		return genero;
	}
	
	
	//Metodos de Animal
	public String movimiento() {
		return "desplazarse";
	}
	
	public String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: " + Reptil.cantidadReptiles() + 
				"\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios();
		
	}
	
	public String toString() {
		if (zona == null) {
			return "Hola mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
		}
		else {
			return "Hola mi nombre es "+nombre+", tengouna edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona+", en el zoo"+zoo;
		}
	}

}
