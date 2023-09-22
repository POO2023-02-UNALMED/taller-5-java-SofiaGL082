package zooAnimales;

public class Mamifero extends Animal{
	private Mamifero[] listado;
	public static int caballos = 0;
	public static int leones = 0;
	private boolean pelaje;
	private int patas;
	
	//Constructor vacio
	public Mamifero() {
		
	}
	
	//Constructor atributos
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	//Metodos get y set para atributos privados

	public void setListado(Mamifero[] listado) {
		this.listado = listado;
	}
	public Mamifero[] getListado() {
		return listado;
	}
	
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
		return caballos+leones;
	}
	public void crearCaballo(String nombre, int edad, String genero) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat("pradera");
		super.setGenero(genero);
		this.pelaje = true;
		this.patas = 4; 
		caballos++;
		
	}
	public void crearLeon(String nombre, int edad, String genero) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat("selva");
		super.setGenero(genero);
		this.pelaje = true;
		this.patas = 4;
		leones++;
		
	}

}
