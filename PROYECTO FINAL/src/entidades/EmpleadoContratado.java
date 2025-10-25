public class EmpleadoContratado extends Empleado {
    private double valorXHora;

    public EmpleadoContratado(String nombre, int legajo, double valorXHora) {
        super(nombre, legajo);
        this.valorXHora = valorXHora;
    }

    @Override
    public double calcularSueldo() {
        // Ejemplo: sueldo base en función de 160 horas mensuales
        return valorXHora * 160;
    }

    // Getter y setter
    public double obtenerValorXHora() {
        return valorXHora;
    }

    public void obtenerValorXHora(double valorXHora) {
        this.valorXHora = valorXHora;
    }
}
