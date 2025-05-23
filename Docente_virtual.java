public class Docente_virtual extends Docente {
    public String materia;
    public String plataforma_clase;

    //constructor Docente_virtual
    public Docente_virtual(String cedula, String nombre, String direccion, String correo,String facultad_pertenece,String hora_clase_asignada,String materia, String plataforma_clase){
        super(cedula,nombre,direccion,correo,null,facultad_pertenece,hora_clase_asignada);
        this.materia=materia;
        this.plataforma_clase=plataforma_clase;
    }

    //metodo heredado de Docentes
    @Override
    public void Mostrar_informacion(){
        super.Mostrar_informacion();
        System.out.println("Materia: "+materia);
        System.out.println("Plataforma de Clase: "+plataforma_clase);
    }
}
