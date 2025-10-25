import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String descripcion;
    private List<Empleado> empleadosAsignados;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.empleadosAsignados = new ArrayList<>();
    }

    public void asignarEmpleado(Empleado empleado) {
        if (empleado.estaLibre()) {
            empleadosAsignados.add(empleado);
            empleado.setEstaAsignado(true);
        }
    }

    public String obtenerDescripcion() {
        return descripcion;
    }

    public List<Empleado> obtenerEmpleadosAsignados() {
        return empleadosAsignados;
    }
}
