public class Triangulo {
    private double lado1, lado2, lado3;

        public double TrianguloArea(double lado1, double lado2, double lado3) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
            double area = (lado1 + lado2 + lado3) / 2;
            return area;
        }

        public double TrianguloPerimetro(double lado1, double lado2, double lado3) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
            double perimetro = lado1 + lado2 + lado3;
            return perimetro;
        }

        public double hipotenusa(double lado1, double lado2, double lado3) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
            if (lado1 > lado2 && lado1 > lado3) {
                return Math.sqrt(lado2 * lado2 + lado3 * lado3);
            } else if (lado2 > lado1 && lado2 > lado3) {
                return Math.sqrt(lado1 * lado1 + lado3 * lado3);
            } else {
                return Math.sqrt(lado1 * lado1 + lado2 * lado2);
            }
        }
}
