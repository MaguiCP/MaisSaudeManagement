package ui;

import controller.EspecificarTiposServico_Controller;
import model.MaisSaude;
import utils.Utils;

/**
 * UI da classe Tipo de serviço
 */
public class EspecificarTipoServico_UI {

    /**
     * Representa o controller da classe TiposServico
     */
    private EspecificarTiposServico_Controller controller;

    /**
     * Cria a clínica e o controller da classe TiposServico
     *
     * @param clinica Clínica MaisSaude
     */
    public EspecificarTipoServico_UI(MaisSaude clinica) {
        controller = new EspecificarTiposServico_Controller(clinica);
    }

    /**
     * Executa os métodos desta classe e cria um tipo de serviço
     */
    public void run() {
        System.out.println("\nNovo tipo de serviço:");
        controller.novoTipoServico();

        introduzDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            if (controller.registaTipoServico()) {
                System.out.println("Tipo de serviço registado com sucesso.");
            } else {
                System.out.println("Tipo de serviço não registada.");
            }
        }
    }

    /**
     * Lê os dados introduzidos pelo utilizador
     */
    private void introduzDados() {
        int id = Utils.IntFromConsole("Introduza o id do tipo de serviço: ");
        String nome = Utils.readLineFromConsole("Introduza o nome do tipo de serviço: ");
        controller.setDados(id, nome);
    }
}
