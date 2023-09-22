package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal{
	private static List<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos = 0;
	public static int leones = 0;
	private boolean pelaje;
	private int patas;
	
	//Constructor vacio
	public Mamifero() {
		listado.add(this);
	}
	
	//Constructor atributos
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	//Metodos get y set para atributos privados
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public boolean getPelaje() {
		return pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public int getPatas() {
		return patas;
	}
	
	//Metodos mamifero
	public static int cantidadMamiferos() {
		return listado.size();
	}
	public void crearCaballo(String nombre, int edad, String genero) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat("pradera");
		super.setGenero(genero);
		this.pelaje = true;
		this.patas = 4; 
		caballos++;
		listado.add(this);
		
	}
	public void crearLeon(String nombre, int edad, String genero) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat("selva");
		super.setGenero(genero);
		this.pelaje = true;
		this.patas = 4;
		leones++;
		listado.add(this);
	}

}
