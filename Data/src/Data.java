import java.util.ArrayList;
import java.util.List;

public class Data {
    public static ArrayList ListaAlumnos(){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Jose","Orellana",18));
        alumnos.add(new Alumno("Mynor","Calderon",16));
        alumnos.add(new Alumno("Santiago","Sakik",18));
        alumnos.add(new Alumno("Dana","Xot",17));
        alumnos.add(new Alumno("Andre","Pijije",20));
        return alumnos;
    }
}
