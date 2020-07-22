
public class Empleado {

private String nombre;
private String apellido;
private int id;
private int salario;

public Empleado(String nom,String ape,int ide, int sala)
{
	dameNombre(nom);
	dameApellido(ape);
	dameIdentidad(ide);
	dameSalario(sala);
}

public void dameNombre(String nom)
{
	nombre=nom;
}

public void dameApellido(String ape)
	{
	apellido=ape;  
	}

	public void dameIdentidad(int ide) 
	{
	id=ide;
	}
	
	public void dameSalario(int sala)
	{
		salario=sala;
	}
	public String devuelveNombre() 
	{
		return nombre;
	}
	public String devuelveApellido() 
	{
		return apellido;
	}
	public int devuelveIdentidad() 
	{
		return id;
	}
	public int devuelveSalario()
	{
		return salario;
	}
	
}