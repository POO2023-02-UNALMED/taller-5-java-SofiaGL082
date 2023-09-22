package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal{
	private static List<Pez> listado = new ArrayList<Pez>();
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	
	//Constructor vacio
	public Pez() {
		listado.add(this);
		
	}
	
	//Constructor atributos
	public Pez(String nombre, int edad, String habitat, String genero, String colorE, int cantAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorE;
		this.cantidadAletas = cantAletas;
		listado.add(this);
	}
	
	//Metodos get y set para atributos privados
	
	public void setColorEscamas(String colorEsc) {
		this.colorEscamas = colorEsc;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setCantidadAletas(int cantAletas) {
		this.cantidadAletas = cantAletas;
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
	public void crearSalmon(String nombre, int edad, String genero) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat("oceano");
		super.setGenero(genero);
		this.colorEscamas = "rojo";
		this.cantidadAletas = 6;
		salmones++;
		listado.add(this);
		
	}
	public void crearBacalao(String nombre, int edad, String genero) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat("oceano");
		super.setGenero(genero);
		this.colorEscamas = "gris";
		this.cantidadAletas = 6;
		bacalaos++;
		listado.add(this);
	}

}
