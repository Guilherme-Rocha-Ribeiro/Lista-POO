package Lista1;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int[] resultado = multiplosOrdenados(n, i, j);
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }

    public static int[] multiplosOrdenados(int n, int i, int j) {
        int[] multiplos = new int[n];
        int numero = 0;
        int index = 0;

        while (index < n) {
            if (ehMultiplo(numero, i) || ehMultiplo(numero, j)) {
                multiplos[index] = numero;
                index++;
            }
            numero++;
        }

        bubbleSort(multiplos); // Chamando a função para ordenar os múltiplos
        return multiplos;
    }

    public static boolean ehMultiplo(int numero, int divisor) {
        return numero % divisor == 0;
    }

    public static void bubbleSort(int[] array) {
        int tamanho = array.length;
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
