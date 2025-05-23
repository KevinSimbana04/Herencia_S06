public class Persona {
    public String cedula;
    public String nombre;
    public String direccion;
    public String correo;
    public String telefono;

    //constructor Persona

    public Persona(String cedula, String nombre, String direccion, String correo, String telefono){
        this.cedula=cedula;
        this.nombre=nombre;
        this.direccion=direccion;
        this.correo=correo;
        this.telefono=telefono;
    }

    //metodo de la clase persona

    public void Mostrar_informacion(){
        System.out.println("Cedula: "+cedula);
        System.out.println("Nombre: "+nombre);
        System.out.println("Dirección: "+direccion);
        System.out.println("Correo: "+correo);
        System.out.println("Telefono: "+telefono);
    }
}
