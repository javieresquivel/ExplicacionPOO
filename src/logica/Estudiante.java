package logica;

public class Estudiante {
	
	public String codigo;
	private String nombres;
	public String apellidos;
	public String correo;
	
	public Estudiante(String codigo, String nombres, String apellidos, String correo) {
		this.codigo = codigo;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getNombres() {
		return nombres.toUpperCase();
	}

}
