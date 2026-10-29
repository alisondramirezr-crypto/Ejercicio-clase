public class Empleado extends Persona implements IEmpleado{
    private double comision;
    private CargoEmpleado cargoEmpleado;

    public Empleado(String nombre, String cedula, int edad, double salario, CargoEmpleado cargoEmpleado) {
        super(nombre, cedula, edad);
        this.comision = salario;
        this.cargoEmpleado = cargoEmpleado;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return cargoEmpleado.getSalarioBase()+comision;
    }

    @Override
    public String toString() {
        return "Empleado" + super.toString() +
                ", comision: " + comision +
                ", cargo empleado=: " + cargoEmpleado +
                ", salario total: " + calcularSalario();
    }
}
