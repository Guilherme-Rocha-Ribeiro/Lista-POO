package Lista_3e4.DiarioTurmas;

public class RegistroNotas {
    private Alunos aluno;
    private Turma turma;
    private double nota;

    public RegistroNotas(Alunos aluno, Turma turma, double nota) {
        this.nota = nota;
        this.turma = turma;
        this.nota = nota;

    }

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
