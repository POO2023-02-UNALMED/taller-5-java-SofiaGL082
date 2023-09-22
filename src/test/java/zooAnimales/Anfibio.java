package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal{
	private static List<Anfibio> listado = new ArrayList<Anfibio>();
	public static int salamandras = 0;
	public static int ranas = 0;
	private static String colorPiel;
	private static boolean venenoso;
	
	//Constructor vacio
	public Anfibio() {
		listado.add(this);
		
	}
	
	//Constructor atributos
	public Anfibio(String nombre, int edad, String habitat, String genero, String cPiel, boolean vene) {
		super(nombre, edad, habitat, genero);
		Anfibio.colorPiel = cPiel;
		Anfibio.venenoso = vene;
		listado.add(this);
	}
	
	//Metodos get y set para atributos privados
	
	public void setColorPiel(String colorPiel) {
		Anfibio.colorPiel = colorPiel;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setVenenoso(boolean veneno) {
		Anfibio.venenoso = veneno;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	
	//Metodos de Anfibio
	public static int cantidadAnfibios() {
		return listado.size();
		
	}
	
	@Override
	public String movimiento() {
		return "Saltar";
	}
	public static void crearRana(String nombre, int edad, String genero) {
		Animal.setNombre(nombre);
		Animal.setEdad(edad);
		Animal.setHabitat("selva");
		Animal.setGenero(genero);
		Anfibio.colorPiel = "rojo";
		Anfibio.venenoso = true;
		ranas++;
		
	}
	public static void crearSalamandra(String nombre, int edad, String genero) {
		Animal.setNombre(nombre);
		Animal.setEdad(edad);
		Animal.setHabitat("selva");
		Animal.setGenero(genero);
		Anfibio.colorPiel = "negro y amarillo";
		Anfibio.venenoso = false;
		salamandras++;
		
	}

}
