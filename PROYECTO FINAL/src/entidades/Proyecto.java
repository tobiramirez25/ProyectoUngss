import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private Cliente cliente;
    private List<Tarea> tareas;

    public Proyecto(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public List<Tarea> obtenerTareas() {
        return tareas;
    }
}