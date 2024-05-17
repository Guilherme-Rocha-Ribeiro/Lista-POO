
package Lista_Aula5.SistemaEscola;


import java.util.ArrayList;
import java.util.List;

public class SistemaGerenciamentoEscola {

    static class Aluno {
        private String nome;
        private int idade;
        private String turma;
        private List<Double> notas;

        public Aluno(String nome, int idade, String turma) {
            this.nome = nome;
            this.idade = idade;
            this.turma = turma;
            this.notas = new ArrayList<>();
        }

        public void adicionarNota(double nota) {
            notas.add(nota);
        }

        public double calcularMedia() {
            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            return soma / notas.size();
        }

        public boolean estaAprovado(double mediaMinima) {
            return calcularMedia() >= mediaMinima;
        }
    }

    static class Professor {
        private String nome;
        private List<String> disciplinas;
        private int cargaHoraria;

        public Professor(String nome, int cargaHoraria) {
            this.nome = nome;
            this.cargaHoraria = cargaHoraria;
            this.disciplinas = new ArrayList<>();
        }

        public void adicionarDisciplina(String disciplina) {
            disciplinas.add(disciplina);
        }
    }

    static class Disciplina {
        private String nome;
        private String horario;

        public Disciplina(String nome, String horario) {
            this.nome = nome;
            this.horario = horario;
        }

        public String getNome() {
            return nome;
        }

        public String getHorario() {
            return horario;
        }
    }

    static class Turma {
        private String nome;
        private List<Aluno> alunos;
        private List<Disciplina> disciplinas;

        public Turma(String nome) {
            this.nome = nome;
            this.alunos = new ArrayList<>();
            this.disciplinas = new ArrayList<>();
        }

        public void adicionarAluno(Aluno aluno) {
            alunos.add(aluno);
        }

        public void adicionarDisciplina(Disciplina disciplina) {
            disciplinas.add(disciplina);
        }

        public List<Aluno> listarAprovados(double mediaMinima) {
            List<Aluno> aprovados = new ArrayList<>();
            for (Aluno aluno : alunos) {
                if (aluno.estaAprovado(mediaMinima)) {
                    aprovados.add(aluno);
                }
            }
            return aprovados;
        }

        public List<Aluno> listarReprovados(double mediaMinima) {
            List<Aluno> reprovados = new ArrayList<>();
            for (Aluno aluno : alunos) {
                if (!aluno.estaAprovado(mediaMinima)) {
                    reprovados.add(aluno);
                }
            }
            return reprovados;
        }

        public String exibirHorariosDisciplinas() {
            StringBuilder horarios = new StringBuilder();
            for (Disciplina disciplina : disciplinas) {
                horarios.append("Disciplina: ").append(disciplina.getNome()).append(", Horário: ").append(disciplina.getHorario()).append("\n");
            }
            return horarios.toString();
        }
    }

    public static void main(String[] args) {
        // Exemplo de utilização:

        // Criando disciplinas
        Disciplina matematica = new Disciplina("Matemática", "Segunda e Quarta, 8h");
        Disciplina portugues = new Disciplina("Português", "Terça e Quinta, 10h");

        // Criando alunos
        Aluno aluno1 = new Aluno("João", 15, "9A");
        aluno1.adicionarNota(7.5);
        aluno1.adicionarNota(8.0);

        Aluno aluno2 = new Aluno("Maria", 16, "9A");
        aluno2.adicionarNota(6.0);
        aluno2.adicionarNota(6.5);

        // Criando turma e adicionando alunos e disciplinas
        Turma turma9A = new Turma("9A");
        turma9A.adicionarAluno(aluno1);
        turma9A.adicionarAluno(aluno2);
        turma9A.adicionarDisciplina(matematica);
        turma9A.adicionarDisciplina(portugues);

        // Calculando e exibindo médias dos alunos
        for (Aluno aluno : turma9A.alunos) {
            System.out.println("Média de " + aluno.nome + ": " + aluno.calcularMedia());
        }

        // Listando alunos aprovados e reprovados
        System.out.println("\nAlunos aprovados:");
        List<Aluno> aprovados = turma9A.listarAprovados(7.0);
        for (Aluno aluno : aprovados) {
            System.out.println(aluno.nome);
        }

        System.out.println("\nAlunos reprovados:");
        List<Aluno> reprovados = turma9A.listarReprovados(7.0);
        for (Aluno aluno : reprovados) {
            System.out.println(aluno.nome);
        }

        // Exibindo horários das disciplinas
        System.out.println("\nHorários das disciplinas:");
        System.out.println(turma9A.exibirHorariosDisciplinas());
    }
}