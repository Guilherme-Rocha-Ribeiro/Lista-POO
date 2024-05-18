package Lista_3e4.questao8;

public class Agenda {
    private Mes mes;
    private String descricao;

    public Agenda(Mes mes, String descricao){
        this.mes = mes;
        this.descricao = descricao;
    }
    public Mes getMes(){
        return mes;
    }
    public String getDescricao() {
        return descricao;
    }
}
