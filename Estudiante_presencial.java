public class Estudiante_presencial extends Estudiante {
    public int horas_presencial;
    public String horario;

    //constructor Estudiante presencial
    public Estudiante_presencial(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel,int anio_nacimiento, int horas_presencial,String horario){
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel, anio_nacimiento);
        this.horas_presencial=horas_presencial;
        this.horario=horario;
    }

    //metodo heredado de estudiante
    @Override
    public int calcular_edad(int anio_nacimiento){
        super.calcular_edad(anio_nacimiento);
        return(2025-anio_nacimiento);
    }

    //metodo heredado de persona
    @Override
    public void Mostrar_informacion(){
        super.Mostrar_informacion();
        System.out.println("Horas Presenciales: "+horas_presencial);
        System.out.println("Horario: "+horario);
    }

}
