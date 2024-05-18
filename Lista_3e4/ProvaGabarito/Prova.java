package Lista_3e4.ProvaGabarito;

public class Prova {
    private Gabarito gabarito;
    private char[] respostasAluno;
    private int numeroQuestao;

    public Prova(Gabarito gabarito) {
        this.gabarito = gabarito;
        this.respostasAluno = new char[15];
        this.numeroQuestao = 0;
    }

    public void respostaAluno(char resposta) {
        if (numeroQuestao < 15) {
            respostasAluno[numeroQuestao] = resposta;
            numeroQuestao++;
        } else {
            System.out.println("Todas as questões já foram respondidas.");
        }
    }

    public int acertos() {
        int quantidadeAcertos = 0;
        for (int i = 0; i < 15; i++) {
            if (respostasAluno[i] == gabarito.respostaQuestao(i + 1)) {
                quantidadeAcertos++;
            }
        }
        return quantidadeAcertos;
    }

    public double nota() {
        int acertos = acertos();
        double nota = (acertos * 0.5) + ((15 - acertos) * 1);
        return nota;
    }
}
