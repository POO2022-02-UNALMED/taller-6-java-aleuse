package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	public static int cantidadCamionetas;

	// Constructor
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		setVolco(volco);
		cantidadCamionetas ++;
	}
	
	// Getters y Setters
	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
}
