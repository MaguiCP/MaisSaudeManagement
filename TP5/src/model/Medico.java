package model;

import utils.Data;

/**
 * Representa um médico
 */
public class Medico {

    /**
     * Código do médico
     */
    private int codigo;

    /**
     * Nome do médico
     */
    private String nome;

    /**
     * Data de contratação
     */
    private Data DataContratacao;

    /**
     * NIF
     */
    private int NIF;

    /**
     * Cédula profissional
     */
    private int cedulaProf;

    /**
     * Especialidade
     */
    private Especialidade Especialidade;

    /**
     * Email
     */
    private String email;

    /**
     * Contato
     */
    private int contato;

    /**
     * Valor default para strings
     */
    private static final String STRING_POR_OMISSAO = "a definir";

    /**
     * Valor default para números
     */
    private static final int INT_POR_OMISSAO = 0;

    /**
     * Constrói uma instância de Médico com os valores passados por
     * parãmetro
     * @param codigo O código do médico
     * @param nome O nome do médico
     * @param DataContratacao A data de contratação
     * @param NIF O NIF
     * @param cedulaProf A cédula profissional
     * @param Especialidade A especialidade
     * @param email O email
     * @param contato O contato
     */
    public Medico(int codigo, String nome, Data DataContratacao, int NIF, int cedulaProf, Especialidade Especialidade, String email, int contato) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setDataContratacao(DataContratacao);
        this.setNIF(NIF);
        this.setCedulaProf(cedulaProf);
        this.setEspecialidade(Especialidade);
        this.setEmail(email);
        this.setContato(contato);
    }

    /**
     * Classe construtora
     */
    public Medico() {
        this.setCodigo(INT_POR_OMISSAO);
        this.setNome(STRING_POR_OMISSAO);
        this.setDataContratacao(new Data());
        this.setNIF(INT_POR_OMISSAO);
        this.setCedulaProf(INT_POR_OMISSAO);
        this.setEspecialidade(new Especialidade());
        this.setEmail(STRING_POR_OMISSAO);
        this.setContato(INT_POR_OMISSAO);
    }

    /**
     * Define o código
     * @param codigo Código do médico
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Define o nome do médico
     * @param nome Nome do médico
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define a data de contratação
     * @param DataContratacao Data de contratação
     */
    public void setDataContratacao(Data DataContratacao) {
        this.DataContratacao = DataContratacao;
    }

    /**
     * Define o NIF
     * @param NIF NIF
     */
    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    /**
     * Define a cédula profissional
     * @param cedulaProf Cédula profissional
     */
    public void setCedulaProf(int cedulaProf) {
        this.cedulaProf = cedulaProf;
    }

    /**
     * Define a especialidade
     * @param Especialidade Especialidade
     */
    public void setEspecialidade(Especialidade Especialidade) {
        this.Especialidade = Especialidade;
    }

    /**
     * Define o email
     * @param email Email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Define o contato
     * @param contato O contato
     */
    public void setContato(int contato) {
        this.contato = contato;
    }

    /**
     * Devolve o código do médico
     * @return Código do médico
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Devolve o nome do médico
     * @return Nome do médico
     */
    public String getNome() {
        return nome;
    }

    /**
     * Devolve a data de contratação
     * @return Data de contratação
     */
    public Data getDataContratacao() {
        return DataContratacao;
    }

    /**
     * Devolve o NIF
     * @return NIF
     */
    public int getNIF() {
        return NIF;
    }

    /**
     * Devolve a cédula profissional
     * @return Cédula profissional
     */
    public int getCedulaProf() {
        return cedulaProf;
    }

    /**
     * Devolve a especialidade
     * @return Especialidade
     */
    public Especialidade getEspecialidade() {
        return Especialidade;
    }

    /**
     * Devolve o email
     * @return Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Devolve o contato
     * @return Contato
     */
    public int getContato() {
        return contato;
    }
    
    /**
     * Valida o médico localmente
     *
     * @return TRUE se o médico for validado, FALSE caso contrário
     */
    // Validação local   
    public boolean valida() {
        // Escrever aqui o código de validação
        return true;
    }

    /**
     * Devolve a descrição atual do médico
     * @return Descrição atual do médico
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código: " + codigo + "\n");
        sb.append("Nome: " + nome + "\n");
        sb.append("Data de Contratação: " + DataContratacao + "\n");
        sb.append("NIF: " + NIF + "\n");
        sb.append("Cédula profissional: " + cedulaProf + "\n");
        sb.append("Especialidade(s): " + Especialidade + "\n");
        sb.append("Email: " + email + "\n");
        sb.append("Contacto: " + contato + "\n");
        return sb.toString();
    }

}
