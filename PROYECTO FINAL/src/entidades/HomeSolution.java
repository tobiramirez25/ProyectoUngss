import java.util.ArrayList;
import java.util.List;

public class HomeSolution {
    private List<Cliente> clientes;
    private List<Proyecto> proyectos;

    public HomeSolution() {
        clientes = new ArrayList<>();
        proyectos = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    public List<Proyecto> obtenerProyectos() {
        return proyectos;
    }
    
}
