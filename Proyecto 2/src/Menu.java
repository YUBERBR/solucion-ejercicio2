import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	private static Scanner scanner =new Scanner(System.in);
	
	public static void mostrarMenu() {
		
		ActividadesEmpleado.inicializarLista();
		
		int opcion=0;
		
	do {
		
		mostrarOpciones();
		
		opcion = validarOpcion();
		
		switch (opcion) {
		
		case 1:
			ActividadesEmpleado.agregarEmpleado();
			break;
		case 2:
			ActividadesEmpleado.eliminarEmpleado();
			break;
		case 3:
			ActividadesEmpleado.mostrarEmpleado();
			break;
		case 4:
			ActividadesEmpleado.actualizarEmpleado();
			break;
		case 5:
			ActividadesEmpleado.mostrarMayorSalario();
			break;
		case 6:
			ActividadesEmpleado.mostrarMenorSalario();
			break;
		case 7:
			ActividadesEmpleado.ordenarPorNombre();
			break;
		case 8:
			ActividadesEmpleado.salarioMayorDe();
			break;
		case 9:
			ActividadesEmpleado.apellidosPorLetraA();
			break;
		case 10:
			ActividadesEmpleado.mejoresSalarios();
			break;
		case 11:
			break;
		default:
			System.out.println("Opción no valida");
		}
		}while(opcion !=11);
		
	System.out.println("Gracias");
	}
		
	private static void mostrarOpciones() {
		
		System.out.println("\nMenu");
		System.out.println("1. Agregar");
		System.out.println("2. Eliminar");
		System.out.println("3. Mostrar");
		System.out.println("4. Actualizar");
		System.out.println("5. Mayor salario");
		System.out.println("6. Menor salario");
		System.out.println("7. Ordenar por nombre");
		System.out.println("8. Salario mayor de 700000");
		System.out.println("9. Apellidos por la letra A");
		System.out.println("10. Los 5 empleados con mejor salario");
		System.out.println("11. Salir");
				
		}
	private static int validarOpcion() {
		
		try {
			return scanner.nextInt();
		}catch(InputMismatchException exception) {
			scanner.nextLine();
			return 0;
		}
	}
}