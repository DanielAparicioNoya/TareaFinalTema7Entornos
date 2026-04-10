package Ejercicio;

public class Cliente {
    private int codCliente;
    private String nombre;
    private String fechaNacimiento;
    private long tlf;
    private Empresa vende;

    public Cliente(int codCliente, String nombre, String fechaNacimiento, long tlf) {
        this.codCliente = codCliente;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tlf = tlf;
    }


    public Empresa getVende() {
        return vende;
    }

    public void setVende(Empresa vende) {
        this.vende = vende;
    }

    public Cliente obtener() {
        return this;
    }

    @Override
    public String toString() {
        return "Cliente [codCliente=" + codCliente + ", nombre=" + nombre + 
               ", fechaNacimiento=" + fechaNacimiento + ", tlf=" + tlf + 
               ", vende=" + vende + "]";
    }
}
