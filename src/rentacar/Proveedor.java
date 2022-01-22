package rentacar;

public class Proveedor {
	private String nombre;
	private int rut;
	private int edad;
	private String direccion;
	private int telefono; 
	private String correo;
	
	public Proveedor(String nombre, int rut, int edad, String direccion, int telefono, String correo) {
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRut() {
		return rut;
	} 

	public void setRut(int rut) {
		this.edad = rut;
	}
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	

}
