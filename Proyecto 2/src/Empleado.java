import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class Empleado {

    private String nombre;
    private String apellido;
    private int id;
    private double salario;

    public Empleado (String nombre, String apellido, int id, double salario) { 
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.salario = salario;}

    public double getSalario() {
        return salario; }

    public void setsalario(double salario) {
        this.salario = salario;}

    public String getNombre() { 
        return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public String getApellido() {
        return apellido;}

    public void setApellido(String apellido) {
        this.apellido = apellido;}

    public int getId() {
        return id;}

    public void setId(int id) {
        this.id = id;}

    @Override
    public String toString() {
        return "Id:" + getId() + " Nombre:" + getNombre() + " Apellido:" + getApellido() + " Nota:" + getSalario();}

    @Override
    public int hashCode(){
        return Objects.hash(id, apellido, nombre);}

    @Override
    public boolean equals(Object object) {

        if(object == this)
            return true;

        if(!(object instanceof Empleado)){
            return false;}

        Empleado empleado = (Empleado) object;

        return empleado.getId() == id &&
               Objects.equals(empleado.getApellido(), apellido) &&
               Objects.equals(empleado.getNombre(), nombre);
    }

	
}