package sv.udb.edu.clases;

abstract public class Electrodomestico {
	//Declaramos las propiedades
	private String Marca;
	private String Modelo;
	private double Precio;
	
	//Constructores
	//Al menos debe haber un constructor
	//Generalmente sera el vacio
	public Electrodomestico() {
		super();
	}
	
	public Electrodomestico(String marca, String modelo,
							double precio) {
		super();
		Marca = marca;
		Modelo = modelo;
		Precio = precio;
	}

	//Getters y Setters de cada propiedad declarada
	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	public double getPrecio() {
		return Precio;
	}
	
	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	//Metodos
	public boolean encender() {
		System.out.println("El electrodomestico ha encendido");
		return true;
	}
	
	public boolean apagar() {
		System.out.println("El electrodomestico esta apagado");
		return true;
	}
}
