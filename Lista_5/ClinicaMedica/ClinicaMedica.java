package Lista_5.ClinicaMedica;

import java.util.ArrayList;
import java.util.List;

class Paciente {
    private String nome;
    private String telefone;

    public Paciente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}


class Medico {
    private String nome;
    private String especialidade;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}


class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String tipo;

    public Consulta(Paciente paciente, Medico medico, String data, String tipo) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.tipo = tipo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }
}


class SistemaAgendamento {
    private List<Consulta> consultas;

    public SistemaAgendamento() {
        this.consultas = new ArrayList<>();
    }

    public void agendarConsulta(Paciente paciente, Medico medico, String data, String tipo) {
        Consulta consulta = new Consulta(paciente, medico, data, tipo);
        consultas.add(consulta);
        System.out.println("Consulta agendada para o(a) paciente " + paciente.getNome() + " com o médico " + medico.getNome() + " na data " + data + ".");
    }

    public String verificarDisponibilidade(Medico medico, String data) {
        for (Consulta consulta : consultas) {
            if (consulta.getMedico().equals(medico) && consulta.getData().equals(data)) {
                return "Médico(a) " + medico.getNome() + " está ocupado(a) na data " + data + ".";
            }
        }
        return "Médico(a) " + medico.getNome() + " está disponível na data " + data + ".";
    }

    public void enviarLembrete(Paciente paciente, String data) {
        System.out.println("Lembrete de consulta para o paciente " + paciente.getNome() + " na data " + data + ".");
    }
}

public class ClinicaMedica {
    public static void main(String[] args) {
        // Criando pacientes
        Paciente paciente1 = new Paciente("Maria", "123456789");
        Paciente paciente2 = new Paciente("João", "987654321");

        // Criando médicos
        Medico medico1 = new Medico("Dr. Pedro", "Cardiologia");
        Medico medico2 = new Medico("Dra. Ana", "Dermatologia");

        // Criando sistema de agendamento
        SistemaAgendamento sistema = new SistemaAgendamento();

        // Agendando consultas
        sistema.agendarConsulta(paciente1, medico1, "2024-05-20", "Presencial");
        sistema.agendarConsulta(paciente2, medico2, "2024-05-21", "Telemedicina");

        // Verificando disponibilidade de horários
        System.out.println("Disponibilidade para Dr. Pedro em 2024-05-20: " + sistema.verificarDisponibilidade(medico1, "2024-05-20"));
        System.out.println("Disponibilidade para Dr. Ana em 2024-05-21: " + sistema.verificarDisponibilidade(medico2, "2024-05-21"));

        // Enviando lembretes
        sistema.enviarLembrete(paciente1, "2024-05-20");
        sistema.enviarLembrete(paciente2, "2024-05-21");
    }
}
