public class EmpleadoDePlanta extends Empleado {
    private double valorXDia;

    public EmpleadoDePlanta(String nombre, int legajo, double valorXDia) {
        super(nombre, legajo);
        this.valorXDia = valorXDia;
    }

    @Override
    public double calcularSueldo() {
        // Ejemplo: sueldo base en función de 22 días mensuales
        return valorXDia * 22;
    }

    // Getter y setter
    public double obtenerValorXDia() {
        return valorXDia;
    }

    public void obtenerValorXDia(double valorXDia) {
        this.valorXDia = valorXDia;
    }
}
