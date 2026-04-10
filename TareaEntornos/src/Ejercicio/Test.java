package Ejercicio;

public class Test {
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa("B1234567", "Microsoft", "c/El pez s/n", 987654321L);

        Cliente miCliente = new Cliente(1, "Daniel Aparicio", "17/04/2008", 23482938L);

        miCliente.setVende(miEmpresa);

        System.out.println(miCliente.toString());
        System.out.println(miEmpresa.toString());
    }
}
