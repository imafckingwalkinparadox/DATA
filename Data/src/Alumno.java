public class Alumno {
    //Pripiedades
    private String nombre;
    private String apellido;
    private int edad;

    public Alumno(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Metodos GET
    public String getnombre(){
        return nombre;
    }
    public String getapellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }

    //Metodos SET
    public String setnombre(){
        return nombre;
    }
    public String setapellido(){
        return apellido;
    }
    public int edad(){
        return edad;
    }
}
