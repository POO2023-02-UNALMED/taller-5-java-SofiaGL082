package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal{
	private static List<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas = 0;
	public static int serpientes = 0;
	private static String colorEscamas;
	private static int largoCola;
	
	//Constructor vacio
	public Reptil() {
		listado.add(this);
		
	}
	
	//Constructor atributos
	public Reptil(String nombre, int edad, String habitat, String genero, String cEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		Reptil.colorEscamas = cEscamas;
		Reptil.largoCola = largoCola;
		listado.add(this);
	}
	
	//Metodos get y set para atributos privados
	
	public void setColorEscamas(String colorEscamas) {
		Reptil.colorEscamas = colorEscamas;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setLargoCola(int largoCola) {
		Reptil.largoCola = largoCola;
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
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		serpientes++;
		return serpiente;
	}

}
