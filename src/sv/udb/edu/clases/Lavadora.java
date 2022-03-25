package sv.udb.edu.clases;

public class Lavadora extends Electrodomestico{
	//Propiedades
	private String TipoLavadora;
	private String Color;
	private String Tamanio;
	private boolean Secadora;
	
	//Declaramos constructores
	//Constructor vacio
	public Lavadora() {
		super();
	}
	
	//Constructor lleno
	public Lavadora(String marca, String modelo, double precio,
					String tipoLavadora, String color,
					String tamanio, boolean secadora) {
		super(marca, modelo, precio);
		TipoLavadora = tipoLavadora;
		Color = color;
		Tamanio = tamanio;
		Secadora = secadora;
	}

	//Getters y Setters
	public String getTipoLavadora() {
		return TipoLavadora;
	}

	public void setTipoLavadora(String tipoLavadora) {
		TipoLavadora = tipoLavadora;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getTamanio() {
		return Tamanio;
	}

	public void setTamanio(String tamanio) {
		Tamanio = tamanio;
	}

	public boolean isSecadora() {
		return Secadora;
	}

	public void setSecadora(boolean secadora) {
		Secadora = secadora;
	}
	
	//Metodos
	public boolean lavar() {
		System.out.println("La lavadora inicio ciclo de lavado");
		return true;
	}
	
	public boolean secar() {
		if(Secadora == true) {
			System.out.println("La lavadora inicio ciclo de secado");
			return true;
		}
		else {
			System.out.println("La lavadora no tiene secadora");
			return false;
		}
	}
	
}
