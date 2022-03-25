package sv.udb.edu.clases;

public class Televisor extends Electrodomestico {
	//Propiedades de la clase televisor
	private double Tamaño;
	private String MaterialPantalla;
	private boolean Inteligente;
	
	//Constructores
	//Constructor vacio
	public Televisor() {
		super();
	}

	//Constructor lleno
	public Televisor(String marca, String modelo, double precio,
					double tamaño, String materialPantalla,
					boolean inteligente) {
		super(marca, modelo, precio);
		Tamaño = tamaño;
		MaterialPantalla = materialPantalla;
		Inteligente = inteligente;
	}

	//Getter y Setter
	public double getTamaño() {
		return Tamaño;
	}

	public void setTamaño(double tamaño) {
		Tamaño = tamaño;
	}

	public String getMaterialPantalla() {
		return MaterialPantalla;
	}

	public void setMaterialPantalla(String materialPantalla) {
		MaterialPantalla = materialPantalla;
	}

	public boolean isInteligente() {
		return Inteligente;
	}

	public void setInteligente(boolean inteligente) {
		Inteligente = inteligente;
	}
	
	//Metodos
	public void conectarInternet() {
		if(Inteligente == true) {
			System.out.println("El televisor se ha conectado a Internet");
		}
		else {
			System.out.println("El televisor no es inteligente, no es posible conectarse a Internet");
		}
	}
	
}
