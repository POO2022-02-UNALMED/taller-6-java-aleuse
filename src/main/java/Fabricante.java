package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int vehiculosVendidos;
	private static ArrayList<Fabricante> listaFabricas = new ArrayList<>();
	
	// Constructor
	public Fabricante(String nombre, Pais pais) {
		setNombre(nombre);
		setPais(pais);
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getVehiculosVendidos() {
		return vehiculosVendidos;
	}

	public void setVehiculosVendidos(int vehiculosVendidos) {
		this.vehiculosVendidos = vehiculosVendidos;
	}

	public static ArrayList<Fabricante> getListaFabricas() {
		return listaFabricas;
	}

	public static void setListaFabricas(ArrayList<Fabricante> listaFabricas) {
		Fabricante.listaFabricas = listaFabricas;
	}
	
	// Metodos
	public static Fabricante fabricaMayorVentas() {
		Fabricante fabricaMayorVentas = listaFabricas.get(0);
		for (Fabricante p : listaFabricas) {
			if (p.vehiculosVendidos > fabricaMayorVentas.vehiculosVendidos) {
				fabricaMayorVentas = p;
			}
		}
		return fabricaMayorVentas;
	}
}
