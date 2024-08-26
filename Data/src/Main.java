import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList alumnos = Data.ListaAlumnos();

        for (Object cadaalumno : alumnos) {
            System.out.println(cadaalumno);
        }

    }
}