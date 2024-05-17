package Lista2;
import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;


    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }



    public void info() {
        System.out.println("Tipo do produto: " + nome);
        System.out.println("Valor do produto: " + preco);
        System.out.println("Quantidade em estoque: " + estoque);
    }


    public static Produto criarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço do produto R$: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int estoque = scanner.nextInt();

        return new Produto(nome, preco, estoque);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de produtos a serem cadastrados: ");
        int n = scanner.nextInt();

        Produto[] produtos = new Produto[n];

        for (int i = 0; i < n; i++) {
            produtos[i] = Produto.criarProduto();
        }


        System.out.println("\nInformações dos produtos cadastrados:");
        for (int i = 0; i < n; i++) {
            produtos[i].info();
            System.out.println();
        }
    }
}
