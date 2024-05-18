package Lista_3e4.questao8;
public enum Mes {
    JANEIRO("Janeiro"),
    FEVEREIRO("Fevereiro"),
    MARCO("Março"),
    ABRIL("Abril"),
    MAIO("Maio"),
    JUNHO("Junho"),
    JULHO("Julho"),
    AGOSTO("Agosto"),
    SETEMBRO("Setembro"),
    OUTUBRO("Outubro"),
    NOVEMBRO("Novembro"),
    DEZEMBRO("Dezembro");

    private final String descricao;

    private Mes(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
