package controller;

import model.Convencao;
import model.MaisSaude;
import utils.Data;

/**
 * Controller da classe Convenção
 */
public class RegistarConvencao_Controller {

    /**
     * Controller da classe Registar convenção
     *
     * @author Diogo Santos, Maria Cardoso, Margarida Pereira
     */
    /**
     * Representa a clínica MaisSaude
     */
    private final MaisSaude clinica;

    /**
     * Representa uma convenção
     */
    private Convencao convencao;

    /**
     * Cria a clínica
     *
     * @param clinica Clínica MaisSaude
     */
    public RegistarConvencao_Controller(MaisSaude clinica) {
        this.clinica = clinica;
    }

    /**
     * Cria uma nova convenção
     */
    public void novaConvencao() {
        this.convencao = clinica.novaConvencao();
    }

    /**
     * Define dados da convenção
     *
     * @param codConvencao O código da convenção
     * @param nomeCurto Nome curto da convenção
     * @param nomeLongo Nome longo da convenção
     * @param dataC Data da convenção
     * @param paginaWeb Pagina web da convenção
     */
    public void setDados(int codConvencao, String nomeCurto, String nomeLongo, Data dataC, String paginaWeb) {
        this.convencao.setCodConvencao(codConvencao);
        this.convencao.setNomeCurto(nomeCurto);
        this.convencao.setNomeCompleto(nomeLongo);
        this.convencao.setDataC(dataC);
        this.convencao.setPaginaWeb(paginaWeb);
    }

    /**
     * Devolve o código da convenção
     *
     * @return Código da convenção
     */
    public int getCodConvencao() {
        return this.convencao.getCodConvencao();
    }

    /**
     * Regista a convencao
     *
     * @return convencao
     */
    public boolean registaConvencao() {
        return this.clinica.registaConvencao(convencao);
    }

    /**
     * Devolve a descrição atual da convenção
     *
     * @return Descrição atual da convenção
     */
    public String getConvencaoAsString() {
        return this.convencao.toString();
    }
}
