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
	public boolean isPelaje() {
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
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones++;
		return leon;
	}
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		return caballo;
	}

}
