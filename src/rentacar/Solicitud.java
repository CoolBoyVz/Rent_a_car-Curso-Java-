package rentacar;

public class Solicitud {
	private String fechaDesde;
	private String fechaHasta;
	private String tipoVehiculo;
	private String vehiculo;
	private String rutcliente;
	private String recogerEn;
	private String devolverEn;
	
	public Solicitud (String fechaDesde, String fechaHasta, String tipoVehiculo, String vehiculo,
			String rutcliente, String recogerEn, String devolverEn) {
	this.fechaDesde = fechaDesde;
	this.fechaHasta = fechaHasta;
	this.tipoVehiculo = tipoVehiculo;
	this.vehiculo = vehiculo;
	this.rutcliente = rutcliente;
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
		public String getTipoVehiculo() {
		return tipoVehiculo;
		}
		public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
		}
		public String getVehiculo() {
		return vehiculo;
		}
		public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
		}
		public String getRutcliente() {
		return rutcliente;
		}
		public void setRutcliente(String rutcliente) {
		this.rutcliente = rutcliente;
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
