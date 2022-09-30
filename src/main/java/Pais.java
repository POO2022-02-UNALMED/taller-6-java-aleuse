package vehiculos;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	private int vehiculosVendidos;
	private static ArrayList<Pais> listaPaises = new ArrayList<>();
	
	// Constructor
	public Pais(String pais) {
		setNombre(pais);
		listaPaises.add(this);
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getVehiculosVendidos() {
		return vehiculosVendidos;
	}

	public void setVehiculosVendidos(int vehiculosVendidos) {
		this.vehiculosVendidos = vehiculosVendidos;
	}

	public static ArrayList<Pais> getListaPaises() {
		return listaPaises;
	}

	public static void setListaPaises(ArrayList<Pais> listaPaises) {
		Pais.listaPaises = listaPaises;
	}

	// Metodos
	public static Pais paisMasVendedor() {
		Pais paisMasVendedor = listaPaises.get(0);
		for (Pais p : listaPaises) {
			if (p.vehiculosVendidos > paisMasVendedor.vehiculosVendidos) {
				paisMasVendedor = p;
			}
		}
		return paisMasVendedor;
	}
	
}
