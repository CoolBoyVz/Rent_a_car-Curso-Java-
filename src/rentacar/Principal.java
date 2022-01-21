package rentacar;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Juan",34,"Avenida 23",5683,"juan@hotmail.com","Rios","Soto");
		Cliente cliente2 = new Cliente("Maria",56,"Esquina 67",7666,"maria@gmail.com","Cubillos","Ortega");
		
		Vehiculo vehiculo1 = new Vehiculo("ABCD-11", "Chevrolet", "Aveo", 30000, 4, "SI");
		Vehiculo vehiculo2 = new Vehiculo("BCDE-22", "Hyundai", "Morning", 35000, 4, "NO");
		Vehiculo vehiculo3 = new Vehiculo("CDEF-33", "Ford", "F-150", 65000, 4, "SI");
				

	}

}
