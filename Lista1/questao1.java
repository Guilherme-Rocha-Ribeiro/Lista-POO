package Lista1;

// questao 1

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insira um numero para verificar se ele é par ou impar");
        int inteiro = myObj.nextInt();
        if (inteiro % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }
    }
}
