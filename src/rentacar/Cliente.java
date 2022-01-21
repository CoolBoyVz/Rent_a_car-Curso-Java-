package rentacar;

public class Cliente extends Proveedor {
	// Atributos adicionales
	String apellido1 = "";
	String apellido2 = "";

	// Constructor
	public Cliente
	( String nombre,
	String edad,
	String direccion,
	int telefono,
	String correo,
	String apellido1,
	String apellido2
	) {
	super(nombre, edad, direccion, telefono, correo);
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	}

	// Getters & setters
	public String getApellido1() {
	return apellido1;
	}

	public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
	}

	public String getApellido2() {
	return apellido2;
	}

	public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
	}

	}