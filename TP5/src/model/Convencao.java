package model;

import utils.Data;

/**
 * Representa uma convenção
 */
public class Convencao {

    /**
     * Código da convenção
     */
    private int codConvencao;

    /**
     * Nome curto da convenção
     */
    private String nomeCurto;

    /**
     * Nome longo da convenção
     */
    private String nomeLongo;

    /**
     * Data da convenção
     */
    private Data dataC;
    /**
     * Página Web da convenção
     */
    private String paginaWeb;
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
    public Convencao() {
        this.setCodConvencao(INT_POR_OMISSAO);
        this.setNomeCurto(STRING_POR_OMISSAO);
        this.setNomeCompleto(STRING_POR_OMISSAO);
        this.setDataC(new Data());
        this.setPaginaWeb(STRING_POR_OMISSAO);
    }

    /**
     * Constrói uma instância de convencao com os valores passados por
     * parâmetros
     *
     * @param codConvencao O código da convenção
     * @param nomeCurto O nome curto da convenção
     * @param nomeLongo O nome longo da convenção
     * @param dataC A data da convenção
     * @param paginaWeb A página Web da convenção
     */
    public Convencao(int codConvencao, String nomeCurto, String nomeLongo, Data dataC, String paginaWeb) {
        this.codConvencao = codConvencao;
        this.nomeCurto = nomeCurto;
        this.nomeLongo = nomeLongo;
        this.dataC = dataC;
        this.paginaWeb = paginaWeb;
    }

    /**
     * Devolve o código da convenção
     *
     * @return código da convenção
     */
    public int getCodConvencao() {
        return codConvencao;
    }

    /**
     * Define o código da convenção
     *
     * @param codConvencao Código da convenção
     */
    public void setCodConvencao(int codConvencao) {
        this.codConvencao = codConvencao;
    }

    /**
     * Devolve o nome curto da convenção
     *
     * @return nome curto da convenção
     */
    public String getNomeCurto() {
        return nomeCurto;
    }

    /**
     * Define o nome curto da convenção
     *
     * @param nomeCurto Nome curto da convenção
     */
    public void setNomeCurto(String nomeCurto) {
        this.nomeCurto = nomeCurto;
    }

    /**
     * Devolve o nome longo da convenção
     *
     * @return nome longo da convenção
     */
    public String getNomeLongo() {
        return nomeLongo;
    }

    /**
     * Define o nome longo da convenção
     *
     * @param nomeLongo Nome longo da convenção
     */
    public void setNomeCompleto(String nomeLongo) {
        this.nomeLongo = nomeLongo;
    }

    /**
     * Devolve a data da convenção
     *
     * @return data da convenção
     */
    public Data getDataC() {
        return dataC;
    }

    /**
     * Define a Data da convenção
     *
     * @param dataC Data da convenção
     */
    public void setDataC(Data dataC) {
        this.dataC = dataC;
    }

    /**
     * Devolve a página Web da convenção
     *
     * @return página Web da convenção
     */
    public String getPaginaWeb() {
        return paginaWeb;
    }

    /**
     * Define a página Web da convenção
     *
     * @param paginaWeb Pagina Web da convenção
     */
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    /**
     * Valida a convenção localmente
     *
     * @return TRUE se a convenção for validada, FALSE caso contrário
     */
    // Validação local   
    public boolean valida() {
        // Escrever aqui o código de validação
        return true;
    }

    @Override
    public String toString() {
        return "Convencao{" + "codConvencao=" + codConvencao + ", nomeCurto=" + nomeCurto + ", nomeLongo=" + nomeLongo + ", dataC=" + dataC + ", paginaWeb=" + paginaWeb + '}';
    }

}
