package rentacar;

public class Mantencion {

	private String fecha_inicio;
	private String fechas_termino;
	private String tipo;
	private int valor; 
	private Proveedor proveedor;
	private Vehiculo vehiculo;
	private Cliente cliente;
	
	public Mantencion(String fecha_inicio, String fechas_termino, String tipo, int valor, Proveedor proveedor,
						Vehiculo vehiculo, Cliente cliente) {
	super();
		this.fecha_inicio = fecha_inicio;
		this.fechas_termino = fechas_termino;
		this.tipo = tipo;
		this.valor = valor;
		this.proveedor = proveedor;
		this.vehiculo = vehiculo;
		this.cliente = cliente;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFechas_termino() {
		return fechas_termino;
	}

	public void setFechas_termino(String fechas_termino) {
		this.fechas_termino = fechas_termino;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public Proveedor getProveedor() {
		return proveedor;
	}
	
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	} 
	
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



}
