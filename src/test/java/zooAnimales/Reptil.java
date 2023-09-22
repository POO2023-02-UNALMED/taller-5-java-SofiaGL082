package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal{
	private static List<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas;
	private int largoCola;
	
	//Constructor vacio
	public Reptil() {
		listado.add(this);
		
	}
	
	//Constructor atributos
	public Reptil(String nombre, int edad, String habitat, String genero, String cEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = cEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	//Metodos get y set para atributos privados
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public int getLargoCola() {
		return largoCola;
	}
	
	//Metodos de Reptil
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	public void crearIguana(String nombre, int edad, String genero) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat("humedal");
		super.setGenero(genero);
		this.colorEscamas = "verde";
		this.largoCola = 3;
		iguanas++;
		listado.add(this);
		
	}
	public void crearSerpiente(String nombre, int edad, String genero) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat("jungla");
		super.setGenero(genero);
		this.colorEscamas = "blanco";
		this.largoCola = 1;
		serpientes++;
		listado.add(this);
		
	}

}
