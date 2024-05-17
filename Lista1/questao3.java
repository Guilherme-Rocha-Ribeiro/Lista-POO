package Lista1;
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inteiro = scanner.nextInt();
        String tamanho = Integer.toString(inteiro);
        int comprimento = tamanho.length();


        if (comprimento == 1) {
            System.out.println("Digito unico");
        } else {
            int potencia = comprimento - 1;
            int resultado = (int) Math.pow(10, potencia);

            int primeiroDigito = inteiro / resultado;
            int resto = inteiro % resultado;

            int ultimoDigito = inteiro % 10;

            if (primeiroDigito == resto) {
                System.out.println("Primeiro e ultimo são iguais");
            } else {
                System.out.println("Primeiro e ultimo diferentes");
            }
        }
    }
}