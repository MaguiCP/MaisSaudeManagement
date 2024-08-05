package controller;

import java.util.List;
import model.Servico;
import model.MaisSaude;
import model.TipoServico;

/**
 * Controller da classe Servico
 */
public class RegistarServico_Controller {

    /**
     * Representa a clínica MaisSaude
     */
    private final MaisSaude clinica;

    /**
     * Representa um serviço
     */
    private Servico servico;

    /**
     * Cria a clínica
     *
     * @param clinica Clínica MaisSaude
     */
    public RegistarServico_Controller(MaisSaude clinica) {
        this.clinica = clinica;
    }

    /**
     * Cria um novo serviço
     */
    public void novoServico() {
        this.servico = clinica.novoServico();
    }

    /**
     * Define dados do serviço
     *
     * @param codServico O código do serviço
     * @param design A designação do serviço
     * @param preco O preço do serviço
     */
    public void setDados(int codServico, String design, int preco) {
        this.servico.setCodServico(codServico);
        this.servico.setDesign(design);
        this.servico.setPreco(preco);
    }

    /**
     * Define o tipo de serviço
     *
     * @param tipoServico Tipo de serviço
     */
    public void setTipoServico(TipoServico tipoServico) {
        this.servico.setTipoServico(tipoServico);
    }

    /**
     * Devolve o código do serviço
     *
     * @return Código do serviço
     */
    public int getCodServico() {
        return this.servico.getCodServico();
    }

    /**
     * Regista o serviço
     *
     * @return Serviço
     */
    public boolean registaServico() {
        return this.clinica.registaServico(servico);
    }

    /**
     * Devolve a descrição atual do serviço
     *
     * @return Descrição atual do serviço
     */
    public String getServicoAsString() {
        return this.servico.toString();
    }

    /**
     * Devolve a lista de tipos de serviço
     *
     * @return Lista de tipos de serviço
     */
    public List<TipoServico> getListaTipoServico() {
        return this.clinica.getLstTipoServicos();
    }
}
