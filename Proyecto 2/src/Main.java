import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	ArrayList<Double>listadoEmpleado;
	
	public static void main(String[] args)
			
	{
		
		Empleado e1=new Empleado("Yuber","Buitrago Rodríguez",7183957,2800000);
		System.out.println("Nombre del Empleado 1 " +e1.devuelveNombre());
		System.out.println("Apelldo del Empleado 1 "+e1.devuelveApellido());
		System.out.println("Identificación del Empleado 1 "+e1.devuelveIdentidad());
		System.out.println("Salario del Empleado 1  "+e1.devuelveSalario());
		
		Empleado e2=new Empleado("Paola","Beleño Garzón ",1116859356,3500000);
		System.out.println("\nNombre del Empleado 2 " +e2.devuelveNombre());
		System.out.println("Apelldo del Empleado 2 "+e2.devuelveApellido());
		System.out.println("Identificación del Empleado 2 "+e2.devuelveIdentidad());
		System.out.println("Salario del Empleado 2 "+e2.devuelveSalario());
		
		Empleado e3=new Empleado("Samuel","Alarcón Riaño ",238939836,1500000);
		System.out.println("\nNombre del Empleado 3 " +e3.devuelveNombre());
		System.out.println("Apelldo del Empleado 3"+e3.devuelveApellido());
		System.out.println("Identificación del Empleado 3 "+e3.devuelveIdentidad());
		System.out.println("Salario del Empleado 3 "+e3.devuelveSalario());
		
		Empleado e4=new Empleado("María","Londoño Castro ",1118959034,2500000);
		System.out.println("\nNombre del Empleado 4 " +e4.devuelveNombre());
		System.out.println("Apelldo del Empleado 4"+e3.devuelveApellido());
		System.out.println("Identificación del Empleado 4 "+e4.devuelveIdentidad());
		System.out.println("Salario del Empleado 4 "+e4.devuelveSalario());
	}
		
		
}
