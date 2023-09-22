package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal{
	private static List<Anfibio> listado = new ArrayList<Anfibio>();
	public static int salamandras = 0;
	public static int ranas = 0;
	private String colorPiel;
	private boolean venenoso;
	
	//Constructor vacio
	public Anfibio() {
		listado.add(this);
		
	}
	
	//Constructor atributos
	public Anfibio(String nombre, int edad, String habitat, String genero, String cPiel, boolean vene) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = cPiel;
		this.venenoso = vene;
		listado.add(this);
	}
	
	//Metodos get y set para atributos privados
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setVenenoso(boolean veneno) {
		this.venenoso = veneno;
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
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas++;
		return rana;
		
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras++;
		return salamandra;
		
	}

}
