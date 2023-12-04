package persona;
public class Viajero {
    private String DNI;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String direccion;

    //Constructor(Tiene el mismo nombre que la clase)
    public void Viajero(String DNI,String nombre,String apellido,String nacionalidad,String direccion){

        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;

    }
    //Se quita el public porque queiro que sea package private
    String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    void setDNI(String dNI) {
        DNI = dNI;
    }
}
