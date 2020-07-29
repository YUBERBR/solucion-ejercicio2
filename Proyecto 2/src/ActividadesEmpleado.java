import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class ActividadesEmpleado {

	private static final List<Empleado> listaEmpleados = new ArrayList<>();
	
	public static void inicializarLista() {
		
		listaEmpleados.add(new Empleado("Yuber", "Buitrago Rodríguez",7183957,2800000));
		listaEmpleados.add(new Empleado("Paola", "Beleño Garzón",11165467,3850000));
		listaEmpleados.add(new Empleado("María Paula", "Paez Salazar",1103456978,1500000));
		listaEmpleados.add(new Empleado("Alejandro", "Belalcazar Correa",1117435879,1850000));
		listaEmpleados.add(new Empleado("Laura", "Peñuela Torres",1047876356,2200000));
		listaEmpleados.add(new Empleado("José", "Alvarez Ramírez",12234554,1200000));
		listaEmpleados.add(new Empleado("Wilson", "Bernal Galvis",12356786,900000));
	}
	public static void agregarEmpleado() {
		//Scanner teclado = new Scanner(System.in); 
		//double Empleado = 0;
		System.out.println("Agregar empleado");
		 //Empleado = teclado.nextDouble();
		//listaEmpleados.addAll(listaEmpleados);
	}
	public static void eliminarEmpleado() {
		System.out.println("Eliminar empleado");
		listaEmpleados.remove("Yuber");
	}
	public static void mostrarEmpleado() {
		System.out.println("Mostrar empleados"+listaEmpleados.size());
			listaEmpleados.forEach(empleado->
				System.out.println(empleado));				
			
	}
	public static void actualizarEmpleado() {
		System.out.println("Actulizar empleados");
	}
	public static void mostrarMayorSalario() {
		System.out.println("El empleado con mejor salario es: ");
		System.out.println(listaEmpleados.stream()
				.max(Comparator.comparing(Empleado::getSalario))
				.map(Empleado::toString)
				.orElse("No hay Empleados"));
				}
	public static void mostrarMenorSalario() {
		System.out.println("El empleado con menor salario es: ");
		System.out.println(listaEmpleados.stream()
				.min(Comparator.comparing(Empleado::getSalario))
				.map(Empleado::toString)
				.orElse("No hay Empleados"));
				}
	public static void ordenarPorNombre() {
		System.out.println("Ordenar por nombre");
		listaEmpleados.stream()
					.sorted(Comparator.comparing(Empleado::getNombre))
					.forEach(System.out::println);
	}
	public static void salarioMayorDe() {
		System.out.println("Salarios mayores a 700000");
		listaEmpleados.stream()
							.filter(empleado -> empleado.getSalario() >=700000);
	}
	public static void apellidosPorLetraA() {
		System.out.println("Selección de apellidos por la letra A");
		listaEmpleados.stream()
						.filter(empleado -> empleado.getApellido().toUpperCase().startsWith("A"))
						.forEach(System.out::println);
	}
	public static void mejoresSalarios() {
		System.out.println("Los 5 Empleados con mejor salario son:");
		
	}
}

