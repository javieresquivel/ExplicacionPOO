package principal;

public class Cerdito {

	public String nombre;
	public Casa casa;
	
	public Cerdito(String nombre) {
		this.nombre = nombre;
	}
	
	public void construirCasa(Material material) {
		this.casa = new Casa(material);
	}
	
}
