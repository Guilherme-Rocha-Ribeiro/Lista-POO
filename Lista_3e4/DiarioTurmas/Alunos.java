package Lista_3e4.DiarioTurmas;

import java.util.Date;

public class Alunos {
    private String nome;
    private String matricula;
    private Date data_nascimento;

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Alunos(String nome, String matricula, Date data_nascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.data_nascimento = data_nascimento;

    }

}
