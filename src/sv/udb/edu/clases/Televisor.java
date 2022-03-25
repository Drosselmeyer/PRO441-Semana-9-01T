package sv.udb.edu.clases;

public class Televisor extends Electrodomestico {
	//Propiedades de la clase televisor
	private double Tama�o;
	private String MaterialPantalla;
	private boolean Inteligente;
	
	//Constructores
	//Constructor vacio
	public Televisor() {
		super();
	}

	//Constructor lleno
	public Televisor(String marca, String modelo, double precio,
					double tama�o, String materialPantalla,
					boolean inteligente) {
		super(marca, modelo, precio);
		Tama�o = tama�o;
		MaterialPantalla = materialPantalla;
		Inteligente = inteligente;
	}

	//Getter y Setter
	public double getTama�o() {
		return Tama�o;
	}

	public void setTama�o(double tama�o) {
		Tama�o = tama�o;
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
