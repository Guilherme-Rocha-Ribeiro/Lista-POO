package Lista_3e4.DiarioTurmas;

public class Turma {
    private String codigo;
    private String disciplina;


    public String getCodigo() {
        return codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public Turma(String codigo, String disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
