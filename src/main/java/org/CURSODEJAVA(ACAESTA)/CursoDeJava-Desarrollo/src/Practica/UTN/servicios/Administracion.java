import java.util.List;
import Estudiante;

public class Administracion {

  public void listarEstudiantes(List<Estudiante> estudiantes) {
    for (Estudiante estudiante : estudiantes) {
      System.out.println(estudiante.toString());
    }
  }

}
