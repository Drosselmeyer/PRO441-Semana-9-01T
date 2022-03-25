package sv.udb.edu.clases;

public class Refrigerador extends Electrodomestico{
	//Propiedades
	private String Color;
	private double Tamaño;
	private String Enfriamiento;
	private int NoPuertas;
	private boolean Filtro;
	
	//Constructores
	//Constructor vacio
	public Refrigerador() {
		super();
	}
	
	//Constructor lleno
	public Refrigerador(String marca, String modelo, double precio, 
						String color, double tamaño,
						String enfriamiento, int noPuertas,
			boolean filtro) {
		super(marca, modelo, precio);
		Color = color;
		Tamaño = tamaño;
		Enfriamiento = enfriamiento;
		NoPuertas = noPuertas;
		Filtro = filtro;
	}

	//Getter y setters
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getTamaño() {
		return Tamaño;
	}

	public void setTamaño(double tamaño) {
		Tamaño = tamaño;
	}

	public String getEnfriamiento() {
		return Enfriamiento;
	}

	public void setEnfriamiento(String enfriamiento) {
		Enfriamiento = enfriamiento;
	}

	public int getNoPuertas() {
		return NoPuertas;
	}

	public void setNoPuertas(int noPuertas) {
		NoPuertas = noPuertas;
	}

	public boolean isFiltro() {
		return Filtro;
	}

	public void setFiltro(boolean filtro) {
		Filtro = filtro;
	}
	
	//Metodos	
	public boolean enfriar() {
		System.out.println("El refrigerador esta enfriando");
		return true;
	}
	
}
