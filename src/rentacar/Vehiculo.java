package rentacar;

public class Vehiculo {
	private String patente;
	private String marca;
	private String modelo; 
	private int tarifa;
	private int pasajero; //capacidad de pasajeros
	private String disponibilidad;

	public Vehiculo(String patente, String marca, String modelo, int tarifa,
	int pasajero, String disponibilidad) {
	super();
	this.patente = patente;
	this.marca = marca;
	this.modelo = modelo;
	this.tarifa = tarifa;
	this.pasajero = pasajero;
	this.disponibilidad = disponibilidad;
	}
 
	public String getPatente() {
	return patente;
	}

	public void setPatente(String patente) {
	this.patente = patente;
	}

	public String getMarca() {
	return marca;
	}

	public void setMarca(String marca) {
	this.marca = marca;
	}

	public String getModelo() {
	return modelo;
	}

	public void setModelo(String modelo) {
	this.modelo = modelo;
	}

	public int getTarifa() {
	return tarifa;
	}

	public void setTarifa(int tarifa) {
	this.tarifa = tarifa;
	}

	public int getPasajero() {
	return pasajero;
	}

	public void setPasajero(int pasajero) {
	this.pasajero = pasajero;
	}

	public String getDisponibilidad() {
	return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
	this.disponibilidad = disponibilidad;
	}


}
