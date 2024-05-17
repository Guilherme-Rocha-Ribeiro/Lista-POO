package Lista2;

import java.util.Scanner;
public class Triangulo {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.altura = altura;
        this.base = base;
    }

    public void area() {
        int valorArea = (base * altura)/2;
        System.out.println("A area do triangulo é: " + valorArea);

    }

    public void perimetro() {
        int valorPerimetro = (base * 3);
        System.out.println("O valor do perimetro é: " + valorPerimetro);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite Base e altura");
        int base = scanner.nextInt();
        int altura = scanner.nextInt();

        Triangulo trianguloUsuario = new Triangulo(base, altura);
        trianguloUsuario.area();
        trianguloUsuario.perimetro();

    }
}
