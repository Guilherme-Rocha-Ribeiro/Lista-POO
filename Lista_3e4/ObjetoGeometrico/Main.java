package Lista_3e4.ObjetoGeometrico;

import java.lang.Math;


class ObjetoGeometrico {
    // Métodos
    public void mostrarDados() {}
    public double calcularArea() { return 0.0; }
    public double calcularPerimetro() { return 0.0; }
}


class Circulo extends ObjetoGeometrico {
    // Atributos
    private double centroX;
    private double centroY;
    private double raio;

    // Construtor
    public Circulo(double centroX, double centroY, double raio) {
        this.centroX = centroX;
        this.centroY = centroY;
        this.raio = raio;
    }


    @Override
    public void mostrarDados() {
        System.out.println("Círculo:");
        System.out.println("Centro: (" + centroX + ", " + centroY + ")");
        System.out.println("Raio: " + raio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}


class Retangulo extends ObjetoGeometrico {
    // Atributos
    private double lado1;
    private double lado2;


    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }


    @Override
    public void mostrarDados() {
        System.out.println("Retângulo:");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }
}


class Triangulo extends ObjetoGeometrico {

    private double lado1;
    private double lado2;
    private double lado3;


    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    @Override
    public void mostrarDados() {
        System.out.println("Triângulo:");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
    }

    @Override
    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso
        Circulo circulo = new Circulo(0, 0, 5);
        circulo.mostrarDados();
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        Retangulo retangulo = new Retangulo(3, 4);
        retangulo.mostrarDados();
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());

        Triangulo triangulo = new Triangulo(3, 4, 5);
        triangulo.mostrarDados();
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
    }
}

