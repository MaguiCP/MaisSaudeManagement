package ui;

import java.io.IOException;
import model.MaisSaude;
import utils.Utils;

/**
 * Representa o menu do diretor geral
 */
public class MenuDG_UI {

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
    public MenuDG_UI(MaisSaude clinica) {
        this.clinica = clinica;
    }

    /**
     * Executa o menu do diretor geral
     *
     * @throws IOException Exceção
     */
    public void run() throws IOException {
        do {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Especificar Especialidade");
            System.out.println("2. Especificar Tipo de Serviço");
            System.out.println("3. Consultar Médicos por Especialidade");
            System.out.println("0. Voltar");
            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if (opcao.equals("1")) {
                System.out.println("Selecinada a opção: Especificar Especialidade");
                EspecificarEspecialidade_UI ui = new EspecificarEspecialidade_UI(clinica);
                ui.run();
            } else if (opcao.equals("2")) {
                System.out.println("Selecionada a opção: Especificar Tipo de Serviço");
                EspecificarTipoServico_UI ui = new EspecificarTipoServico_UI(clinica);
                ui.run();
            } else if (opcao.equals("3")) {
                //Completar
                System.out.println("Selecionada a opção: Consultar Médicos por Especialidade");
            }
        } while (!opcao.equals("0"));
    }
}
