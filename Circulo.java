public class Circulo {
    
    private double radio;

        public double CirculoArea(double radio) {
            this.radio = radio;
            double area = Math.PI * (Math.pow(radio, 2));
            return area;
        }

        public double CirculoPerimetro(double radio) {
            this.radio = radio;
            double perimetro = 2 * Math.PI * radio;
            return perimetro;
        }
}
