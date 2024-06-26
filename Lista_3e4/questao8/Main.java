package Lista_3e4.questao8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o Mês");
        System.out.println("(a) Janeiro");
        System.out.println("(b) Fevereiro");
        System.out.println("(c) Março");
        System.out.println("(d) Abril");
        System.out.println("(e) Maio");
        System.out.println("(f) Junho");
        System.out.println("(g) Julho");
        System.out.println("(h) Agosto");
        System.out.println("(i) Setembro");
        System.out.println("(j) Outubro");
        System.out.println("(k) Novembro");
        System.out.println("(l) Dezembro");

        String opcao = scanner.nextLine();
        switch (opcao) {
            default:
                System.out.println("Opção Inválida");
                break;
            case "a":
                System.out.println("Coloque a descrição do compromisso para Janeiro:");
                String descricaoJaneiro = scanner.nextLine();
                Agenda agendaJaneiro = new Agenda(Mes.JANEIRO, descricaoJaneiro);
                System.out.println("Compromisso marcado para " + agendaJaneiro.getMes() + ": " + agendaJaneiro.getDescricao());
                break;
            case "b":
                System.out.println("Coloque a descrição do compromisso para Fevereiro:");
                String descricaoFevereiro = scanner.nextLine();
                Agenda agendaFevereiro = new Agenda(Mes.FEVEREIRO, descricaoFevereiro);
                System.out.println("Compromisso marcado para " + agendaFevereiro.getMes() + ": " + agendaFevereiro.getDescricao());
                break;
            case "c":
                System.out.println("Coloque a descrição do compromisso para Março:");
                String descricaoMarco = scanner.nextLine();
                Agenda agendaMarco = new Agenda(Mes.MARCO, descricaoMarco);
                System.out.println("Compromisso marcado para " + agendaMarco.getMes() + ": " + agendaMarco.getDescricao());
                break;
            case "d":
                System.out.println("Coloque a descrição do compromisso para Abril:");
                String descricaoAbril = scanner.nextLine();
                Agenda agendaAbril = new Agenda(Mes.ABRIL, descricaoAbril);
                System.out.println("Compromisso marcado para " + agendaAbril.getMes() + ": " + agendaAbril.getDescricao());
                break;
            case "e":
                System.out.println("Coloque a descrição do compromisso para Maio:");
                String descricaoMaio = scanner.nextLine();
                Agenda agendaMaio = new Agenda(Mes.MAIO, descricaoMaio);
                System.out.println("Compromisso marcado para " + agendaMaio.getMes() + ": " + agendaMaio.getDescricao());
                break;
            case "f":
                System.out.println("Coloque a descrição do compromisso para Junho:");
                String descricaoJunho = scanner.nextLine();
                Agenda agendaJunho = new Agenda(Mes.JUNHO, descricaoJunho);
                System.out.println("Compromisso marcado para " + agendaJunho.getMes() + ": " + agendaJunho.getDescricao());
                break;
            case "g":
                System.out.println("Coloque a descrição do compromisso para Julho:");
                String descricaoJulho = scanner.nextLine();
                Agenda agendaJulho = new Agenda(Mes.JULHO, descricaoJulho);
                System.out.println("Compromisso marcado para " + agendaJulho.getMes() + ": " + agendaJulho.getDescricao());
                break;
            case "h":
                System.out.println("Coloque a descrição do compromisso para Agosto:");
                String descricaoAgosto = scanner.nextLine();
                Agenda agendaAgosto = new Agenda(Mes.AGOSTO, descricaoAgosto);
                System.out.println("Compromisso marcado para " + agendaAgosto.getMes() + ": " + agendaAgosto.getDescricao());
                break;
            case "i":
                System.out.println("Coloque a descrição do compromisso para Setembro:");
                String descricaoSetembro = scanner.nextLine();
                Agenda agendaSetembro = new Agenda(Mes.SETEMBRO, descricaoSetembro);
                System.out.println("Compromisso marcado para " + agendaSetembro.getMes() + ": " + agendaSetembro.getDescricao());
                break;
            case "j":
                System.out.println("Coloque a descrição do compromisso para Outubro:");
                String descricaoOutubro = scanner.nextLine();
                Agenda agendaOutubro = new Agenda(Mes.OUTUBRO, descricaoOutubro);
                System.out.println("Compromisso marcado para " + agendaOutubro.getMes() + ": " + agendaOutubro.getDescricao());
                break;
            case "k":
                System.out.println("Coloque a descrição do compromisso para Novembro:");
                String descricaoNovembro = scanner.nextLine();
                Agenda agendaNovembro = new Agenda(Mes.NOVEMBRO, descricaoNovembro);
                System.out.println("Compromisso marcado para " + agendaNovembro.getMes() + ": " + agendaNovembro.getDescricao());
                break;
            case "l":
                System.out.println("Coloque a descrição do compromisso para Dezembro:");
                String descricaoDezembro = scanner.nextLine();
                Agenda agendaDezembro = new Agenda(Mes.DEZEMBRO, descricaoDezembro);
                System.out.println("Compromisso marcado para " + agendaDezembro.getMes() + ": " + agendaDezembro.getDescricao());
                break;
        }
    }
}
