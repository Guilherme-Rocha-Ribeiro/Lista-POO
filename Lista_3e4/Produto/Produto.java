package Lista_3e4.Produto;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    public Produto(String nome, double precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        if (precoVenda < this.precoCusto) {
            System.out.println("O preço de venda não pode ser inferior ao preço de custo para obter uma margem de lucro.");
        } else {
            this.precoVenda = precoVenda;
        }
    }

    public void calcularMargemLucro() {
        this.margemLucro = precoVenda - precoCusto;
    }

    public double getMargemLucroPorcentagem() {
        return (margemLucro / precoCusto) * 100;
    }

    public double calcularPrejuizo() {
        if (precoVenda < precoCusto) {
            return precoCusto - precoVenda;
        } else {
            return 0;
        }
    }

    public void info() {
        if (precoVenda < precoCusto) {
            System.out.println("Prejuízo: R$" + calcularPrejuizo());
        } else {
            System.out.println("Tipo do produto: " + nome);
            System.out.println("Preço de custo: R$" + precoCusto);
            System.out.println("Preço de venda: R$" + precoVenda);
            System.out.println("Margem de lucro: R$" + margemLucro);
            System.out.println("Margem de lucro (%): " + getMargemLucroPorcentagem() + "%");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Informe o preço de custo do produto: ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Informe o preço de venda do produto: ");
        double precoVenda = scanner.nextDouble();

        Produto produto = new Produto(nomeProduto, precoCusto);
        produto.setPrecoVenda(precoVenda);
        produto.calcularMargemLucro();
        produto.info();
    }
}

