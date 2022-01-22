package rentacar;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Juan",33454,53,"Avenida 23",876578,"juan@hotmail.com","Rios","Soto");
		Cliente cliente2 = new Cliente("Maria",123446,34,"Esquina 67",7666,"maria@gmail.com","Cubillos","Ortega");
		
		Vehiculo vehiculo1 = new Vehiculo("ABCD-11", "Chevrolet", "Aveo", 30000, 4, "SI");
		Vehiculo vehiculo2 = new Vehiculo("BCDE-22", "Hyundai", "Morning", 35000, 4, "NO");
		Vehiculo vehiculo3 = new Vehiculo("CDEF-33", "Ford", "F-150", 65000, 4, "SI");
				
		System.out.println("Nuevo Arriendo de vehiculo");
		Solicitud solicitud1 = new Solicitud("23-01-2022", "30-01-2022", vehiculo1 , cliente1, "Vespucio", "Avenida");
		
		System.out.println("El cliente " + solicitud1.getCliente().getNombre() +" "+ solicitud1.getCliente().getApellido1() 
			+ " solicita el auto "+ vehiculo1.getMarca() + " " + vehiculo1.getModelo());
		System.out.println("Disponibilidad: " + vehiculo1.getDisponibilidad());
		
	}

}
