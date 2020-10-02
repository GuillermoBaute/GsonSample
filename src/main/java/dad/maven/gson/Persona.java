package dad.maven.gson;

public class Persona {

	private String Nombre, Apellido;
	private Integer Edad;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}

	public Integer getEdad() {
		return Edad;
	}

	public void setEdad(Integer edad) {
		this.Edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + Nombre + ", apellido=" + Apellido + ", edad=" + Edad + "]";
	}

}
