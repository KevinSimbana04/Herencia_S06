public class Estudiante extends Persona{
    public String carrera;
    public String nivel;
    public int anio_nacimiento;

    //constructor estudiante
    public Estudiante(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel,int anio_nacimiento){
        super(cedula, nombre, direccion, correo, telefono);
        this.carrera=carrera;
        this.nivel=nivel;
        this.anio_nacimiento=anio_nacimiento;
    }

    //metodo heredado de estudiante
    public int calcular_edad(int anio_nacimiento){
        return (2025-anio_nacimiento);
    }

    //metodo heredado
    @Override
    public void Mostrar_informacion(){
        super.Mostrar_informacion();
        System.out.println("Carrera: "+carrera);
        System.out.println("Nivel: "+nivel);
        System.out.println("Edad: " +calcular_edad(anio_nacimiento));
    }
}
