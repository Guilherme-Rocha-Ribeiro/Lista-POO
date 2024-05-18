package Lista_3e4.ProvaGabarito;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes

        char[] gabaritoRespostas = {'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E'};
        Gabarito gabarito = new Gabarito(gabaritoRespostas);

        Prova provaAluno1 = new Prova(gabarito);
        provaAluno1.respostaAluno('A');
        provaAluno1.respostaAluno('B');
        provaAluno1.respostaAluno('C');
        provaAluno1.respostaAluno('D');
        provaAluno1.respostaAluno('E');
        provaAluno1.respostaAluno('A');
        provaAluno1.respostaAluno('B');
        provaAluno1.respostaAluno('C');
        provaAluno1.respostaAluno('D');
        provaAluno1.respostaAluno('E');
        provaAluno1.respostaAluno('A');
        provaAluno1.respostaAluno('B');
        provaAluno1.respostaAluno('C');
        provaAluno1.respostaAluno('D');
        provaAluno1.respostaAluno('E');

        Prova provaAluno2 = new Prova(gabarito);
        provaAluno2.respostaAluno('A');
        provaAluno2.respostaAluno('B');
        provaAluno2.respostaAluno('C');
        provaAluno2.respostaAluno('D');
        provaAluno2.respostaAluno('E');
        provaAluno2.respostaAluno('A');
        provaAluno2.respostaAluno('B');
        provaAluno2.respostaAluno('C');
        provaAluno2.respostaAluno('D');
        provaAluno2.respostaAluno('E');
        provaAluno2.respostaAluno('A');
        provaAluno2.respostaAluno('B');
        provaAluno2.respostaAluno('C');
        provaAluno2.respostaAluno('E');
        provaAluno2.respostaAluno('C');

        System.out.println("Nota do aluno 1: " + provaAluno1.nota());
        System.out.println("Nota do aluno 2: " + provaAluno2.nota());
    }
}
