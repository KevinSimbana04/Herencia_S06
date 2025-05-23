public class main {
    public static void main(String[] args){

        //Obejto Persona
        Persona persona=new Persona("1234","Kevin","quito","ks@gmail.com","096874");

        //objeto Estudiante
        Estudiante estudiante=new Estudiante("43643","Alexis","manta","al@gmail.com","094358", "Software","3", 2004);

        //Objeto Estudainte presencial
        Estudiante_presencial E_presencial=new Estudiante_presencial("75753","Jhair","Loja","js@gmail.com","0964788", "Quimica","4", 2006,10,"Lunes a Viernes");

        //Objeto Estudiante virtual
        Estudiante_virtual E_virtual=new Estudiante_virtual("489032","Evelyn","Cuenca","es@gmail.com","0353477", "Administracion","2", 2003,"Zoom","Yadira Franco");

        //Objeto Docente
        Docente docente=new Docente("1234","Kevin","quito","ks@gmail.com","096874", "Sistemas","10");


        //llamar a las clases
        persona.Mostrar_informacion();
        System.out.println();
        estudiante.Mostrar_informacion();
        System.out.println();
        E_presencial.Mostrar_informacion();
        System.out.println();
        E_virtual.Mostrar_informacion();
        System.out.println();
        docente.Mostrar_informacion();
    }
}
