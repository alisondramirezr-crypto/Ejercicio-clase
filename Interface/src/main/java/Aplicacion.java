public class Aplicacion {
    static void main() {
        Cliente cliente = new Cliente("Ana", "123", 20, "ana@uq.edu.co");

        Empleado empleado = new Empleado("Juan", "456", 25, 2300000, CargoEmpleado.CAJERO);

        ClienteEmpleado clienteEmpleado = new ClienteEmpleado("Martin", "789", 28, "mt@uq.edu.co", CargoEmpleado.GERENTE);

        System.out.println("===Cliente===");
        System.out.println(cliente.toString());

        System.out.println("===Empleado===");
        System.out.println(empleado.toString());

        System.out.println("===Cliente Empleado===");
        System.out.println(clienteEmpleado.toString());
    }
}
