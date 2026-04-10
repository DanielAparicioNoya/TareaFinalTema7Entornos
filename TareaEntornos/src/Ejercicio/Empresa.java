package Ejercicio;

public class Empresa {
    private String CIF;
    private String razonSocial;
    private String direccion;
    private long tlf; 

   
    public Empresa(String cif, String rs, String dir, long tlf) {
        this.CIF = cif;
        this.razonSocial = rs;
        this.direccion = dir;
        this.tlf = tlf;
    }

    public Empresa obtener() {
        return this; 
    }

    @Override
    public String toString() {
        return "Empresa [CIF=" + CIF + ", razonSocial=" + razonSocial + 
               ", direccion=" + direccion + ", tlf=" + tlf + "]";
    }
}
