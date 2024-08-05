package ui;

import java.io.IOException;
import model.MaisSaude;
import utils.Utils;

/**
 * Representa o menu do diretor clínico
 */
public class MenuDC_UI {

    /**
     * Representa a clínica MaisSaude
     */
    private MaisSaude clinica;

    /**
     * Opção
     */
    private String opcao;

    /**
     * Cria a clínica
     *
     * @param clinica Clínica MaisSaude
     */
    public MenuDC_UI(MaisSaude clinica) {
        this.clinica = clinica;
    }

    /**
     * Executa o menu do diretor clínico
     *
     * @throws IOException Exceção
     */
    public void run() throws IOException {
        do {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Registar Médico");
            System.out.println("2. Registar Serviço");
            System.out.println("3. Consultar Médicos por Especialidade");
            System.out.println("0. Voltar");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if (opcao.equals("1")) {
                System.out.println("Selecionada a opção: Registar médico");
                RegistarMedico_UI ui = new RegistarMedico_UI(clinica);
                ui.run();
            } else if (opcao.equals("2")) {
                System.out.println("Selecionada a opção: Registar Serviço");
                RegistarServico_UI ui = new RegistarServico_UI(clinica);
                ui.run();
            } else if (opcao.equals("3")) {
                //Completar
                System.out.println("Selecionada a opção: Consultar Médicos por Especialidade");
            }

        } while (!opcao.equals("0"));
    }
}
