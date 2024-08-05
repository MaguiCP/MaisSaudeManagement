/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.EspecificarEspecialidade_Controller;
import model.MaisSaude;
import utils.Data;
import utils.Utils;

/**
 * UI da classe Especialidade
 */
public class EspecificarEspecialidade_UI {

    /**
     * Representa o controller da classe Especialidade
     */
    private EspecificarEspecialidade_Controller controller;

    /**
     * Cria a clínica e o controller da classe Especialidade
     *
     * @param clinica Clínica MaisSaude
     */
    public EspecificarEspecialidade_UI(MaisSaude clinica) {
        controller = new EspecificarEspecialidade_Controller(clinica);
    }

    /**
     * Executa os métodos desta classe e cria uma especialidade
     */
    public void run() {
        System.out.println("\nNova especialidade:");
        controller.novaEspecialidade();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            if (controller.registaEspecialidade()) {
                System.out.println("Especialidade registada com sucesso.");
            } else {
                System.out.println("Especialidade não registada.");
            }
        }
    }

    /**
     * Lê os dados introduzidos pelo utilizador
     */
    private void introduzDados() {
        int cod = Utils.IntFromConsole("Introduza o código da especialidade: ");
        String design = Utils.readLineFromConsole("Introduza a designação da especialidade: ");
        String acronimo = Utils.readLineFromConsole("Introduza o acrónimo: ");
        Data dataRegisto = Utils.readDataFromConsole("Introduza a data de registo da especialidade (dd-MM-yyyy): ");
        controller.setDados(cod, design, dataRegisto, acronimo);
    }

    /**
     * Apresenta os dados da especialidade
     */
    private void apresentaDados() {
        System.out.println("\nEspecialidade:\n" + controller.getEspecialidadeAsString());
    }

}
