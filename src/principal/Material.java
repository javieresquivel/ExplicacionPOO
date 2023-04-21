package principal;

public class Material {
	
	public static final int RESISTENCIA_BAJA = 1;
	public static final int RESISTENCIA_MEDIA = 5;
	public static final int RESISTENCIA_ALTA = 10;
	
	public String nombre;
	public int resistencia;
	
	public Material(String nombre, int resistencia) {
		this.nombre = nombre;
		this.resistencia = resistencia;
	}
	
}
