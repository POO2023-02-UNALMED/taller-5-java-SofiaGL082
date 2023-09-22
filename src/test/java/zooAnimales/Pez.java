package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal{
	private static List<Pez> listado = new ArrayList<Pez>();
	public static int salmones = 0;
	public static int bacalaos = 0;
	private static String colorEscamas;
	private static int cantidadAletas;
	
	//Constructor vacio
	public Pez() {
		listado.add(this);
		
	}
	
	//Constructor atributos
	public Pez(String nombre, int edad, String habitat, String genero, String colorE, int cantAletas) {
		super(nombre, edad, habitat, genero);
		Pez.colorEscamas = colorE;
		Pez.cantidadAletas = cantAletas;
		listado.add(this);
	}
	
	//Metodos get y set para atributos privados
	
	public void setColorEscamas(String colorEsc) {
		Pez.colorEscamas = colorEsc;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setCantidadAletas(int cantAletas) {
		Pez.cantidadAletas = cantAletas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	
	//Metodos de Pez
	public static int cantidadPeces() {
		return listado.size();
		
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	public static void crearSalmon(String nombre, int edad, String genero) {
		Animal.setNombre(nombre);
		Animal.setEdad(edad);
		Animal.setHabitat("oceano");
		Animal.setGenero(genero);
		Pez.colorEscamas = "rojo";
		Pez.cantidadAletas = 6;
		salmones++;
	}
	public static void crearBacalao(String nombre, int edad, String genero) {
		Animal.setNombre(nombre);
		Animal.setEdad(edad);
		Animal.setHabitat("oceano");
		Animal.setGenero(genero);
		Pez.colorEscamas = "gris";
		Pez.cantidadAletas = 6;
		bacalaos++;
	}

}
