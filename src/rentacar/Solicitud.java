package rentacar;

public class Solicitud {
	private String fechaDesde;
	private String fechaHasta; 
	private Vehiculo vehiculo;
	private Cliente cliente;
	private String recogerEn;
	private String devolverEn;
	
	public Solicitud (String fechaDesde, String fechaHasta, Vehiculo vehiculo,
			Cliente cliente, String recogerEn, String devolverEn) {
	this.fechaDesde = fechaDesde;
	this.fechaHasta = fechaHasta;
	this.vehiculo = vehiculo;
	this.cliente = cliente;
	this.recogerEn = recogerEn;
	this.devolverEn = devolverEn;
	}
	
	
	public String getFechaDesde() {
		return fechaDesde;
		}
		public void setFechaDesde(String fechaDesde) {
		this.fechaDesde = fechaDesde;
		}
		public String getFechaHasta() {
		return fechaHasta;
		}
		public void setFechaHasta(String fechaHasta) {
		this.fechaHasta = fechaHasta;
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
		public String getRecogerEn() {
		return recogerEn;
		}
		public void setRecogerEn(String recogerEn) {
		this.recogerEn = recogerEn;
		}
		public String getDevolverEn() {
		return devolverEn;
		}
		public void setDevolverEn(String devolverEn) {
		this.devolverEn = devolverEn;
		}

}
