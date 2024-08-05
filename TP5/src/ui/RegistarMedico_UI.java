package ui;

import controller.RegistarMedico_Controller;
import java.util.List;
import model.Especialidade;
import model.MaisSaude;
import utils.Data;
import utils.Utils;

/**
 * UI da classe Médico
 */
public class RegistarMedico_UI {

    /**
     * Representa o controller da classe Servico
     */
    private RegistarMedico_Controller controller;

    /**
     * Opção
     */
    private int cod;

    /**
     * Cria a clínica e o controller da classe Servico
     *
     * @param clinica Cliníca MaisSaude
     */
    public RegistarMedico_UI(MaisSaude clinica) {
        controller = new RegistarMedico_Controller(clinica);
    }

    /**
     * Executa os métodos desta classe e cria um médico
     */
    public void run() {
        System.out.println("\nNovo médico: ");
        controller.novoMedico();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            if (controller.registaMedico()) {
                System.out.println("Médico registado com sucesso.");
            } else {
                System.out.println("Médico não registado.");
            }
        }
    }

    /**
     * Lê os dados introduzidos pelo utilizador
     */
    private void introduzDados() {
        int codigo = Utils.IntFromConsole("Introduza o código do medico: ");
        String nome = Utils.readLineFromConsole("Introduza o nome do médico: ");
        Data DataContratacao = Utils.readDataFromConsole("Introduza a data de contratação:");
        int NIF = Utils.IntFromConsole("Introduza o NIF: ");
        int cedulaProf = Utils.IntFromConsole("Introduza o numero da cedula profissional: ");
        String email = Utils.readLineFromConsole("Introduza o email: ");
        int contato = Utils.IntFromConsole("Introduza o contato:");

        controller.setDados(codigo, nome, DataContratacao, NIF, cedulaProf, email, contato);
        List<Especialidade> arrEsp = controller.getLstEspecialidades();
        System.out.println(arrEsp);
        cod = Utils.IntFromConsole("Introduza a posição do tipo de especialidades na lista: ");
        controller.adicionarEspecialidade(cod);//Adicoinar Especialidade
    }

    /**
     * Apresenta os dados do Médico
     */
    private void apresentaDados() {
        System.out.println("\nMédico:\n" + controller.getMedicoAsString());
    }
}
