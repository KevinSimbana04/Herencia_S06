public class Estudiante_virtual extends Estudiante{
    public String plataforma;
    public String tutor_virtual;

    //contructor para estudiantes virtuales
    public  Estudiante_virtual(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel,int anio_nacimiento, String plataforma,String tutor_virtual){
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel, anio_nacimiento);
        this.plataforma=plataforma;
        this.tutor_virtual=tutor_virtual;
    }

    //metodo heredado de Estudiante
    @Override
    public int calcular_edad(int anio_nacimiento){
        super.calcular_edad(anio_nacimiento);
        return(2025-anio_nacimiento);
    }

    //metodo heredado de Persona
    @Override
    public void Mostrar_informacion(){
        super.Mostrar_informacion();
        System.out.println("Plataforma: "+plataforma);
        System.out.println("Tutor Virtual: "+tutor_virtual);
    }
}
