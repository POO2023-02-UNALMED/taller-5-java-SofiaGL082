package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal{
	private static List<Ave> listado = new ArrayList<Ave>();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	
	//Constructor vacio
	public Ave() {
		listado.add(this);
	}
	
	//Constructor atributos
	public Ave(String nombre, int edad, String habitat, String genero, String cPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = cPlumas;
		listado.add(this);
	}
	
	//Metodos get y set para atributos privados

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
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
	public void crearHalcon(String nombre, int edad, String genero) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat("montanas");
		super.setGenero(genero);
		this.colorPlumas = "cafe glorioso";
		halcones++;
		listado.add(this);
		
	}
	public void crearAguila(String nombre, int edad, String genero) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat("montanas");
		super.setGenero(genero);
		this.colorPlumas = "blanco y amarillo";
		aguilas++;
		listado.add(this);
		
	}

}
