package controller;

import java.util.List;

import model.Especialidade;
import model.MaisSaude;

/**
 * Controller da classe Médico
 */
public class ConsultarMedico_Controller {

    /**
     * Representa a clínica MaisSaude
     */
    private MaisSaude clinica;

    /**
     * Cria a clínica e o controller da classe Especialidade
     *
     * @param clinica Clínica MaisSaude
     */
    public ConsultarMedico_Controller(MaisSaude clinica) {
        this.clinica = clinica;
        //controller = new ConsultarMedico_Controller(clinica);
    }

    /**
     * Devolve a lista de tipos de serviço
     *
     * @return Lista de tipos de serviço
     */
    public List<Especialidade> getLstEspecialidades() {
        return this.clinica.getLstEspecialidades();
    }
}
