
import java.time.LocalDate;
import java.time.Period;

public class Imprimir {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Period edad = persona.calcularPersona(LocalDate.of(2005, 11, 29));
        System.out.println("conocer la cantidad de años, meses y dia de vida.");
        System.out.println("");
        System.out.println("La cantidad de año, meses y dias de vida son: ");
        System.out
                .println("Edad:" + edad.getYears() + " " + "Mes:" + edad.getMonths() + " " + "Dias:" + edad.getDays());
        Cuadrado cuadrado = new Cuadrado();
        double lado = 5;
        System.out.println("");
        System.out.println("Calcular el area y perimetro de un cuadrado");
        System.out.println("");
        System.out.println("El area del cuadrado es: ");
        System.out.println(cuadrado.CuadradoArea(lado));
        System.out.println("El perimetro del cuadrado es: ");
        System.out.println(cuadrado.CuadradoPerimetro(lado));

        Circulo circulo = new Circulo();
        double radio = 10;
        System.out.println("");
        System.out.println("Calcular el area y perimetro de un circulo");
        System.out.println("");
        System.out.println("El area del circulo es: ");
        System.out.println(circulo.CirculoArea(radio));
        System.out.println("El perimetro del circulo es: ");
        System.out.println(circulo.CirculoPerimetro(radio));

        Triangulo triangulo = new Triangulo();
        double lado1 = 3;
        double lado2 = 5;
        double lado3 = 9;
        System.out.println("");
        System.out.println("Calcular el area y perimetro e hipotenusa de un triangulo");
        System.out.println("");
        System.out.println("El area del triangulo es: ");
        System.out.println(triangulo.TrianguloArea(lado1, lado2, lado3));
        System.out.println("El perimetro del triangulo es: ");
        System.out.println(triangulo.TrianguloPerimetro(lado1, lado2, lado3));
        System.out.println("La hipotenusa del triangulo es: ");
        System.out.println(triangulo.hipotenusa(lado1, lado2, lado3));
    }
}
