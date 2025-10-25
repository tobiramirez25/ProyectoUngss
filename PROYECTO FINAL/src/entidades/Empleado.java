public abstract class Empleado {
    protected String nombre;
    protected int legajo;
    protected boolean estaAsignado;
    protected int cantRetrasos;

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.estaAsignado = false;
        this.cantRetrasos = 0;
    }

    public boolean estaLibre() {
        return !estaAsignado;
    }

    public int registrarRetraso() {
        cantRetrasos++;
        return cantRetrasos;
    }

    public int consultarRetrasos() {
        return cantRetrasos;
    }

    public abstract double calcularSueldo();

    // Getters y setters
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerLegajo() {
        return legajo;
    }

    public boolean estaAsignado() {
        return estaAsignado;
    }

    public void estaAsignado(boolean estaAsignado) {
        this.estaAsignado = estaAsignado;
    }
}