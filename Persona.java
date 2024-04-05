import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private LocalDate fechaNacimiento;

    public Period calcularPersona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        LocalDate fechaActual = LocalDate.now();
        return Period.between(this.fechaNacimiento, fechaActual);
    }
}
