package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal{
	private static List<Ave> listado = new ArrayList<Ave>();
	public static int halcones = 0;
	public static int aguilas = 0;
	private static String colorPlumas;
	
	//Constructor vacio
	public Ave() {
		listado.add(this);
	}
	
	//Constructor atributos
	public Ave(String nombre, int edad, String habitat, String genero, String cPlumas) {
		super(nombre, edad, habitat, genero);
		Ave.colorPlumas = cPlumas;
		listado.add(this);
	}
	
	//Metodos get y set para atributos privados

	public void setColorPlumas(String colorPlumas) {
		Ave.colorPlumas = colorPlumas;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	//Metodos de Ave
	public static int cantidadAves() {
		return listado.size();
		
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	public static void crearHalcon(String nombre, int edad, String genero) {
		Animal.setNombre(nombre);
		Animal.setEdad(edad);
		Animal.setHabitat("montanas");
		Animal.setGenero(genero);
		Ave.colorPlumas = "cafe glorioso";
		halcones++;
	}
	public static void crearAguila(String nombre, int edad, String genero) {
		Animal.setNombre(nombre);
		Animal.setEdad(edad);
		Animal.setHabitat("montanas");
		Animal.setGenero(genero);
		Ave.colorPlumas = "blanco y amarillo";
		aguilas++;
	}

}
