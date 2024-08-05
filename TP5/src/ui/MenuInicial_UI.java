package ui;

import java.io.IOException;
import model.MaisSaude;
import utils.Utils;

/**
 * Representa o menu inicial
 */
public class MenuInicial_UI {

    /**
     * Representa a clínica
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
    public MenuInicial_UI(MaisSaude clinica) {
        this.clinica = clinica;
    }

    /**
     * Executa o menu inicial
     *
     * @throws IOException Exceção
     */
    public void run() throws IOException {
        do {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Diretor Geral (DG) ");
            System.out.println("2. Diretor Clinico (DC) ");
            System.out.println("3. Assistente Administrativo");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if (opcao.equals("1")) {
                MenuDG_UI ui = new MenuDG_UI(clinica);
                ui.run();
            } else if (opcao.equals("2")) {
                MenuDC_UI ui = new MenuDC_UI(clinica);
                ui.run();
            } else if (opcao.equals("3")) {
                MenuAA_UI ui = new MenuAA_UI(clinica);
                ui.run();
            }
        } while (!opcao.equals("0"));
    }
}
