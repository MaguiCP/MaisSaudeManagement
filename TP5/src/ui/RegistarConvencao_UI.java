package ui;

import controller.RegistarConvencao_Controller;
import model.MaisSaude;
import utils.Data;
import utils.Utils;

/**
 * UI da classe Convenção
 */
public class RegistarConvencao_UI {

    /**
     * Representa o controller da classe Convencao
     */
    private RegistarConvencao_Controller controller;

    /**
     * Cria a clínica e o controller da classe Convencao
     *
     * @param clinica Cliníca MaisSaude
     */
    public RegistarConvencao_UI(MaisSaude clinica) {
        controller = new RegistarConvencao_Controller(clinica);
    }

    /**
     * Executa os métodos desta classe e cria uma convencao
     */
    public void run() {
        System.out.println("\nNova convencao:");
        controller.novaConvencao();

        introduzDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            if (controller.registaConvencao()) {
                System.out.println("Convenção registado com sucesso.");
            } else {
                System.out.println("Convenção não registado.");
            }
        }
    }

    /**
     * Lê os dados introduzidos pelo utilizador
     */
    private void introduzDados() {
        int codConvencao = Utils.IntFromConsole("Introduza o código da convenção: ");
        String nomeCurto = Utils.readLineFromConsole("Introduza nome curto: ");
        String nomeLongo = Utils.readLineFromConsole("Introduza nome longo: ");
        Data dataC = Utils.readDataFromConsole("Introduza a data: ");
        String paginaWeb = Utils.readLineFromConsole("Introduza página Web: ");

        controller.setDados(codConvencao, nomeCurto, nomeLongo, dataC, paginaWeb);
    }

}
