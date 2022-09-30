package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	public static int cantidadCamiones;
	
	// Constructor
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		setEjes(ejes);
		cantidadCamiones ++;
	}
	
	// Getters y Setters
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
