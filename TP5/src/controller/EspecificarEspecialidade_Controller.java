package controller;

import model.Especialidade;
import model.MaisSaude;
import utils.Data;

/**
 * Controller da classe Especialidade
 */
public class EspecificarEspecialidade_Controller {

    /**
     * Representa a clínica MaisSaude
     */
    private final MaisSaude clinica;

    /**
     * Representa uma especialidade
     */
    private Especialidade especialidade;

    /**
     * Cria a clínica
     *
     * @param clinica Clínica MaisSaude
     */
    public EspecificarEspecialidade_Controller(MaisSaude clinica) {
        this.clinica = clinica;
    }

    /**
     * Cria uma nova especialidade
     */
    public void novaEspecialidade() {
        this.especialidade = clinica.novaEspecialidade();
    }

    /**
     * Define os dados da especialidade
     *
     * @param codEspecialidade O código da especialidade
     * @param design A designação da especialidade
     * @param dataRegisto A data de registo da especialidade
     * @param acronimo O acrónimo da especialidade
     */
    public void setDados(int codEspecialidade, String design, Data dataRegisto, String acronimo) {
        this.especialidade.setCodEspecialidade(codEspecialidade);
        this.especialidade.setDesign(design);
        this.especialidade.setDataRegisto(dataRegisto);
        this.especialidade.setAcronimo(acronimo);
    }

    /**
     * Devolve o código da especialidade
     *
     * @return Código da especialidade
     */
    public int getCodEspecialidade() {
        return this.especialidade.getCodEspecialidade();
    }

    /**
     * Regista a especialidade
     *
     * @return Especialidade
     */
    public boolean registaEspecialidade() {
        return this.clinica.registaEspecialidade(this.especialidade);
    }

    /**
     * Devolve a descrição atual da especialidade
     *
     * @return Descrição atual da especialidade
     */
    public String getEspecialidadeAsString() {
        return this.especialidade.toString();
    }
   
}
