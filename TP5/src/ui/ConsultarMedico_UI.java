package ui;

import controller.ConsultarMedico_Controller;
import java.util.List;
import model.Especialidade;
import model.MaisSaude;
import utils.Utils;

/**
 * UI da classe Médico
 */
public class ConsultarMedico_UI {
    /**
     * Representa o controller da classe Especialidade
     */
    private ConsultarMedico_Controller controller;

    /**
     * Cria a clínica e o controller da classe Especialidade
     * 
     * @param clinica Clínica MaisSaude
     */
    public ConsultarMedico_UI(MaisSaude clinica) {
    }

    /**
     * Executa os métodos desta classe e cria uma especialidade
     */
    public void run() {
        mostrarEspecialidade();

    }

    /**
     * Lê os dados introduzidos pelo utilizador
     */
    private void mostrarEspecialidade() {
        List<Especialidade> arrEsp = controller.getLstEspecialidades();
        System.out.println(arrEsp);
        Utils.IntFromConsole("Seleciona uma especialidade: ");

    }

}
