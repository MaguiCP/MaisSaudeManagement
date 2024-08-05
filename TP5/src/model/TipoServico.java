package model;

/**
 * Representa um tipo de serviço
 */
public class TipoServico {

    /**
     * Nome do tipo de serviço
     */
    private String nome;
    /**
     * código do tipo de serviço
     */
    private int id;
    /**
     * Valor default para strings
     */
    private static final String NOME_POR_OMISSAO = "Por definir";
    /**
     * Valor default para números
     */
    private static final int ID_POR_OMISSAO = 0;

    /**
     * Constrói uma instância de Tipo de serviço com os valores passados por
     * parâmetros
     *
     * @param nome O nome do tipo de serviço
     * @param id código tipo de serviço
     */
    public TipoServico(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    /**
     * Constrói uma instância de Tipo de serviço com os valores passados por
     * parâmetros
     *
     * @param id código tipo de serviço
     */
    public TipoServico(int id) {
        this.id = id;
    }

    /**
     * Classe construtora
     */
    public TipoServico() {
        this.nome = NOME_POR_OMISSAO;
        this.id = ID_POR_OMISSAO;
    }

    /**
     * Devolve o nome do tipo de serviço
     *
     * @return nome do tipo de serviço
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do tipo de serviço
     *
     * @param nome nome do tipo de serviço
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Devolve o código do tipo de serviço
     *
     * @return Código do tipo de serviço
     */
    public int getId() {
        return id;
    }

    /**
     * Define o código do tipo de serviço
     *
     * @param id Código do tipo de serviço
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Valida o tipo deserviço localmente
     *
     * @return TRUE se o tipo deserviço for validado, FALSE caso contrário
     */
    // Validação local   
    public boolean valida() {
        // Escrever aqui o código de validação
        return true;
    }

    /**
     * Devolve a descrição atual do tipo de serviço
     *
     * @return Descrição atual do tipo de serviço
     */
    @Override
    public String toString() {
        return "TipoServico{" + "nome=" + nome + ", id=" + id + '}';
    }

}
