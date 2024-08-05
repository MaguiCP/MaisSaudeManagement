package controller;

import model.MaisSaude;
import model.TipoServico;

/**
 * Controller da classe Tipo de Servico
 */
public class EspecificarTiposServico_Controller {

    /**
     * Representa a clínica MaisSaude
     */
    private final MaisSaude clinica;

    /**
     * Representa um tipo de serviço
     */
    private TipoServico tiposervico;

    /**
     * Cria a clínica
     *
     * @param clinica Clínica MaisSaude
     */
    public EspecificarTiposServico_Controller(MaisSaude clinica) {
        this.clinica = clinica;
    }

    /**
     * Cria um novo tipo de serviço
     */
    public void novoTipoServico() {
        this.tiposervico = clinica.novoTipoServico();
    }

    /**
     * Define os dados do tipo de servico
     *
     * @param id O código do tipo de serviço
     * @param nome O nome do tipo de serviço
     */

    public void setDados(int id, String nome) {
        this.tiposervico.setId(id);
        this.tiposervico.setNome(nome);
    }

    /**
     * Devolve o código do tipo de serviço
     *
     * @return código do tipo de serviço
     */
    public int geIdTipoServico() {
        return this.tiposervico.getId();
    }

    /**
     * Regista o tipo de serviço
     *
     * @return Tipo de serviço
     */
    public boolean registaTipoServico() {
        return this.clinica.registaTipoServico(this.tiposervico);
    }

    /**
     * Devolve a descrição atual do tipo de serviço
     *
     * @return Descrição do tipo de serviço
     */
    public String getTipoServicoAsString() {
        return this.tiposervico.toString();
    }

}
