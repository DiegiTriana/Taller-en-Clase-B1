public class Cuadrado {
    
    private double lado;

    public double CuadradoArea(double lado) {
        this.lado = lado;
        double area = lado * lado;
        return area;
    }

    public double CuadradoPerimetro(double lado) {
        this.lado = lado;
        double perimetro = 4 * lado;
        return perimetro;
    }
}
