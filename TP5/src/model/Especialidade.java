package model;

import utils.Data;

/**
 * Representa uma especialidade
 */
public class Especialidade {

    /**
     * Código da especialidade
     */
    private int codEspecialidade;

    /**
     * Designação da especialidade
     */
    private String design;

    /**
     * Data de registo da especialidade
     */
    private Data dataRegisto;

    /**
     * Acrónimo da especialidade
     */
    private String acronimo;

    /**
     * Valor default para strings
     */
    private static final String STRING_POR_OMISSAO = "a definir";

    /**
     * Valor default para números
     */
    private static final int INT_POR_OMISSAO = 0;

    /**
     * Classe construtora
     */
    public Especialidade() {
        this.setCodEspecialidade(INT_POR_OMISSAO);
        this.setDesign(STRING_POR_OMISSAO);
        this.setDataRegisto(new Data());
        this.setAcronimo(STRING_POR_OMISSAO);
    }

    /**
     * Constrói uma instância de Especialidade com os valores passados por
     * parãmetro
     *
     * @param codEspecialidade O código da especialidade
     * @param design A designação da especialidade
     * @param dataRegisto A data de registo da especialidade
     * @param acronimo O acrónimo da especialidade
     */
    public Especialidade(int codEspecialidade, String design, Data dataRegisto, String acronimo) {
        this.setCodEspecialidade(codEspecialidade);
        this.setDesign(design);
        this.setDataRegisto(dataRegisto);
        this.setAcronimo(acronimo);
    }

    /**
     * Define o código da especialidade
     *
     * @param codEspecialidade Código da especialidade
     */
    public final void setCodEspecialidade(int codEspecialidade) {
        this.codEspecialidade = codEspecialidade;
    }

    /**
     * Define a designação da especialidade
     *
     * @param design Designação da especialidade
     */
    public final void setDesign(String design) {
        this.design = design;
    }

    /**
     * Define a data de registo da especialidade
     *
     * @param dataRegisto Data de registo
     */
    public final void setDataRegisto(Data dataRegisto) {
        this.dataRegisto = new Data(dataRegisto);
    }

    /**
     * Define o acrónimo da especialidade
     *
     * @param acronimo Acrónimo da especialidade
     */
    public final void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    /**
     * Devolve o código da especialidade
     *
     * @return Código da especialidade
     */
    public int getCodEspecialidade() {
        return codEspecialidade;
    }

    /**
     * Valida a especialidade localmente
     *
     * @return TRUE se a especialidade for validada, FALSE caso contrário
     */
    // Validação local   
    public boolean valida() {
        // Escrever aqui o código de validação
        return true;
    }

    /**
     * Devolve a descrição atual da especialidade
     *
     * @return Descrição atual da especialidade
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Código da especialidade: " + codEspecialidade + "\n");
        sb.append("Designação: " + design + "\n");
        sb.append("Data de registo: " + dataRegisto + "\n");
        sb.append("Acrónimo: " + acronimo + "\n");
        return sb.toString();
    }
}
