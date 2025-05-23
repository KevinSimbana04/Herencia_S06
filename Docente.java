
public class Docente extends Persona {
    public String facultad_pertenece;
    public String hora_clase_asignada;

    //constructor para la clase docente
    public Docente(String cedula, String nombre, String direccion, String correo, String telefono, String facultad_pertenece,String hora_clase_asignada){
        super(cedula, nombre, direccion, correo, telefono);
        this.facultad_pertenece=facultad_pertenece;
        this.hora_clase_asignada=hora_clase_asignada;
    }

    //Utilizar metodo de la clase persona
    @Override
    public void Mostrar_informacion(){
        super.Mostrar_informacion();
        System.out.println("Facultad: "+facultad_pertenece);
        System.out.println("Hora de Clase: "+hora_clase_asignada);
    }
}