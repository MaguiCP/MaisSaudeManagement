package ui;

import java.io.IOException;
import model.MaisSaude;
import utils.Utils;

/**
 * Representa o menu da assistente administrativa
 */
public class MenuAA_UI {

    /**
     * Opção
     */
    private String opcao;

    /**
     * Cria a clínica
     *
     * @param clinica Clínica MaisSaude
     */
    public MenuAA_UI(MaisSaude clinica) {
    }

    /**
     * Executa o menu da assistente administrativa
     *
     * @throws IOException Exceção
     */
    public void run() throws IOException {
        do {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Registar Acordo/Convenção");
            System.out.println("2. Consultar Médicos por Especialidade");
            System.out.println("0. Voltar");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if (opcao.equals("1")) {
                //Completar
                System.out.println("Selecionada a opção: Registar Acordo/Convenção");
            } else if (opcao.equals("2")) {
                //Completar
                System.out.println("Selecionada a opção: Consultar Médicos por Especialidade");
            }

        } while (!opcao.equals("0"));
    }
}
