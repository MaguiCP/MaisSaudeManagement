package ui;

import controller.RegistarServico_Controller;
import java.util.List;
import model.MaisSaude;
import model.TipoServico;
import utils.Utils;

/**
 * UI da classe Serviço
 */
public class RegistarServico_UI {

    /**
     * Representa o controller da classe Servico
     */
    private RegistarServico_Controller controller;

    /**
     * Opção
     */
    private int opcao;

    /**
     * Cria a clínica e o controller da classe Servico
     *
     * @param clinica Cliníca MaisSaude
     */
    public RegistarServico_UI(MaisSaude clinica) {
        controller = new RegistarServico_Controller(clinica);
    }

    /**
     * Executa os métodos desta classe e cria um serviço
     */
    public void run() {
        System.out.println("\nNovo serviço:");
        controller.novoServico();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            if (controller.registaServico()) {
                System.out.println("Serviço registado com sucesso.");
            } else {
                System.out.println("Serviço não registado.");
            }
        }
    }

    /**
     * Lê os dados introduzidos pelo utilizador
     */
    private void introduzDados() {
        int codServico = Utils.IntFromConsole("Introduza o código do serviço: ");
        String design = Utils.readLineFromConsole("Introduza a designação do serviço: ");
        int preco = Utils.IntFromConsole("Introduza o preço do serviço: ");
        controller.setDados(codServico, design, preco);
        List<TipoServico> arrTS = controller.getListaTipoServico();
        System.out.println(arrTS);
        opcao = Utils.IntFromConsole("Introduza a posição do tipo de serviço na lista: ");
        controller.setTipoServico(arrTS.get(opcao));
    }

    /**
     * Apresenta os dados de serviço
     */
    private void apresentaDados() {
        System.out.println("\nServiço:\n" + controller.getServicoAsString());
    }
}
