package Lista2;

import java.util.Scanner;

public class contaBancaria {
    // Atributos
    private String titular;
    private float saldo;
    int id_Conta;


    public contaBancaria(String titular, float saldo, int id_Conta) {
        this.titular = titular;
        this.saldo = saldo;
        this.id_Conta = id_Conta;
    }
    // Criar o metodo de saque
    public void saque(float valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void deposito(float valor){
        if (valor > 0) {
            System.out.println("Deposito de " + saldo + " foi efetuado");
            saldo  += valor;
            System.out.println("Valor total na conta: "+ saldo);
        } else {
            System.out.println("Valor invalido");
        }
    }
    public void informacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo da Conta: " + saldo);
        System.out.println("Id da Conta: " + id_Conta);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Titular");
        String nome = sc.nextLine();

        System.out.println("Digite o Saldo");
        float saldoIni = sc.nextFloat();

        System.out.println("Digite o Id da conta");
        int idConta = sc.nextInt();

        contaBancaria contaAtual = new contaBancaria(nome, saldoIni, idConta);

        contaAtual.informacoes();
        contaAtual.deposito(300);
        contaAtual.saque(20);
        contaAtual.saque(3000);
        contaAtual.informacoes();


    }


}

