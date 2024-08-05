package model;

/**
 * Representa um serviço
 */
public class Servico {

    /**
     * Código do serviço
     */
    private int codServico;

    /**
     * Designação do serviço
     */
    private String design;

    /**
     * Preço do serviço
     */
    private int preco;

    /**
     * Tipo de Serviço
     */
    private TipoServico tipoServico;

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
    public Servico() {
        this.setCodServico(INT_POR_OMISSAO);
        this.setDesign(STRING_POR_OMISSAO);
        this.setPreco(INT_POR_OMISSAO);
        this.setTipoServico(new TipoServico());
    }

    /**
     * Constrói uma instância de Serviço com os valores passados por parâmetros
     *
     * @param codServico O código do serviço
     * @param design A designação do serviço
     * @param preco O preço do serviço
     * @param tipoServico O tipo de serviço
     */
    public Servico(int codServico, String design, int preco, TipoServico tipoServico) {
        this.setCodServico(codServico);
        this.setDesign(design);
        this.setPreco(preco);
        this.setTipoServico(tipoServico);
    }

    /**
     * Define o código do serviço
     *
     * @param codServico Código do serviço
     */
    public void setCodServico(int codServico) {
        this.codServico = codServico;
    }

    /**
     * Define a designação do serviço
     *
     * @param design Designação do serviço
     */
    public void setDesign(String design) {
        this.design = design;
    }

    /**
     * Define o preço do serviço
     *
     * @param preco Preço do serviço
     */
    public void setPreco(int preco) {
        this.preco = preco;
    }

    /**
     * Define o tipo de serviço
     *
     * @param tipoServico Tipo de serviço
     */
    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    /**
     * Devolve o código do serviço
     *
     * @return Código do serviço
     */
    public int getCodServico() {
        return codServico;
    }

    /**
     * Valida o serviço localmente
     *
     * @return TRUE se o serviço for validado, FALSE caso contrário
     */
    // Validação local   
    public boolean valida() {
        // Escrever aqui o código de validação
        return true;
    }

    /**
     * Devolve a descrição atual do serviço
     *
     * @return Descrição atual do serviço
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código do serviço: " + codServico + "\n");
        sb.append("Designação: " + design + "\n");
        sb.append("Preço: " + preco + "\n");
        sb.append("Tipo de Serviço: " + tipoServico + "\n");
        return sb.toString();
    }
}
