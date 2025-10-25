public class Cliente {
    private String nombre;
    private int telefono;
    private String mail;

    public Cliente(String nombre, int telefono, String mail) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }

    // Getters y setters
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerTelefono() {
        return telefono;
    }

    public String obtenerMail() {
        return mail;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void establecerMail(String mail) {
        this.mail = mail;
    }
}
