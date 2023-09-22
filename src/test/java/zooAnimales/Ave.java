package zooAnimales;

public class Ave extends Animal{
	private Ave[] listado;
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	
	//Constructor vacio
	public Ave() {
		
	}
	
	//Constructor atributos
	public Ave(String nombre, int edad, String habitat, String genero, String cPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = cPlumas;
	}
	
	//Metodos get y set para atributos privados
	public void setListado(Ave[] listado) {
		this.listado = listado;
	}
	public Ave[] getListado() {
		return listado;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	//Metodos de Ave
	public static int cantidadAves() {
		return halcones+aguilas;
		
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
		
	}
	public void crearAguila(String nombre, int edad, String genero) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat("montanas");
		super.setGenero(genero);
		this.colorPlumas = "blanco y amarillo";
		aguilas++;
		
	}

}
