package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a clínica MaisSaude
 */
public class MaisSaude {

    /**
     * O nome da clínica
     */
    private String nome;

    /**
     * O endereço da clínica
     */
    private String endereco;

    /**
     * O nif da clínica
     */
    private String nif;

    /**
     * O telefone da clínica
     */
    private String telefone;

    /**
     * A página Web da clínica
     */
    private String pagWeb;

    /**
     * O email da clínica
     */
    private String email;

    // UC1
    /**
     * Lista de especialidades
     */
    private final List<Especialidade> lstEspecialidades;

    /**
     * Lista de serviços
     */
    private final List<Servico> lstServicos;
    /**
     * Lista tipo de tipos de serviços
     */
    private final List<TipoServico> lstTipoServicos;
    /**
     * Lista de convencoes
     */
    private final List<Convencao> lstConvencoes;
     /**
     * Lista de convencoes
     */
    private final List<Medico> lstMedicos;


    /**
     * Constrói uma instância da clínica MaisSaude com os valores passados por
     * parâmetro
     *
     * @param nome O nome da clínica
     * @param endereco O endereço da clínica
     * @param nif O nif da clínica
     * @param telefone O telefone da clínica
     * @param pagWeb A página Web da clínica
     * @param email O email da clínica
     */
    public MaisSaude(String nome, String endereco, String nif, String telefone, String pagWeb, String email) {
        this.setEndereco(endereco);
        this.setNif(nif);
        this.setPagWeb(pagWeb);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setNome(nome);
        this.lstServicos = new ArrayList<>();
        this.lstEspecialidades = new ArrayList<>();
        this.lstTipoServicos = new ArrayList<>();
        this.lstConvencoes = new ArrayList<>();
        this.lstMedicos = new ArrayList<>();
    }

    /**
     * Constrói uma instância da clínica MaisSaude com o parâmetro "nome"
     * passado por parâmetro
     *
     * @param nome O nome da clínica
     */
    public MaisSaude(String nome) {
        this.setNome(nome);
        this.lstServicos = new ArrayList<>();
        this.lstEspecialidades = new ArrayList<>();
        this.lstTipoServicos = new ArrayList<>();
        this.lstConvencoes = new ArrayList<>();
        this.lstMedicos = new ArrayList<>();
    }

    /**
     * Define o endereço da clínica
     *
     * @param endereco Endereço da clínica
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Define o NIF da clínica
     *
     * @param nif NIF da clínica
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Define o telefone da clínica
     *
     * @param telefone Telefone da clínica
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Define a página Web da clínica
     *
     * @param pagWeb Página Web da clínica
     */
    public void setPagWeb(String pagWeb) {
        this.pagWeb = pagWeb;
    }

    /**
     * Define o email da clínica
     *
     * @param email Email da clínica
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Define o nome da clínica
     *
     * @param nome Nome da clínica
     */
    public final void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Devolve uma nova especialidade
     *
     * @return Especialidade
     */
    public Especialidade novaEspecialidade() {
        return new Especialidade();
    }

    /**
     * Regista uma especialidade
     *
     * @param especialidade
     * @return TRUE se a especialidade for registada, FALSE caso contrário
     */
    public boolean registaEspecialidade(Especialidade especialidade) {
        if (this.valida(especialidade)) {
            adicionaEspecialidade(especialidade);
            return true;
        }
        return false;
    }

    /**
     * Adiciona uma especialidade à lista de especialidades
     *
     * @param especialidade Especialidade
     */
    private void adicionaEspecialidade(Especialidade especialidade) {
        lstEspecialidades.add(especialidade);
    }

    /**
     * Valida o medico globalmente
     *
     * @param medico Médico
     * @return TRUE se o médico for validado, FALSE caso contrário
     */
    // Validação global
    public boolean valida(Medico medico) {
        boolean resp = false;
        if (medico.valida()) {
            // Escrever aqui o código de validação

            //
            resp = true;
        }
        return resp;
    }

    /**
     * Valida a especialidade globalmente
     *
     * @param especialidade Especialidade
     * @return TRUE se a especialidade for validada, FALSE caso contrário
     */
    // Validação global
    public boolean valida(Especialidade especialidade) {
        boolean resp = false;
        if (especialidade.valida()) {
            // Escrever aqui o código de validação

            //
            resp = true;
        }
        return resp;
    }

    /**
     * Devolve a descrição atual da clínica
     *
     * @return Descrição atual da clínica
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Nome da clinica: " + nome + "\n");
        sb.append("Endereço: " + endereco + "\n");
        sb.append("NIF: " + nif + "\n");
        sb.append("Telefone: " + telefone + "\n");
        sb.append("Página Web: " + pagWeb + "\n");
        sb.append("Email: " + email + "\n");
        sb.append("Lista de especialidades: " + lstEspecialidades.toString() + "\n");
        sb.append("Lista de serviços: " + lstServicos.toString() + "\n");
        sb.append("Lista de tipos de serviços: " + lstTipoServicos.toString() + "\n");
        sb.append("Lista de convencoes: " + lstConvencoes.toString() + "\n");
        return sb.toString();
    }

    /**
     * Devolve um novo serviço
     *
     * @return Serviço
     */
    public Servico novoServico() {
        return new Servico();
    }

    /**
     * Devolve um novo tipo de serviço
     *
     * @return Tipo de serviço
     */
    public TipoServico novoTipoServico() {
        return new TipoServico();
    }

    /**
     * Devolve uma nova convenção
     *
     * @return Convencao
     */
    public Convencao novaConvencao() {
        return new Convencao();
    }

     /**
     * Regista um médico
     *
     * @param medico Médico
     * @return TRUE se o médico for registado, FALSE caso contrário
     */
    public boolean registaMedico(Medico medico) {
        if (this.valida(medico)) {
            adicionaMedico(medico);
            return true;
        }
        return false;
    }
    
    /**
     * Regista um serviço
     *
     * @param servico Serviço
     * @return TRUE se o serviço for registado, FALSE caso contrário
     */
    public boolean registaServico(Servico servico) {
        if (this.valida(servico)) {
            adicionaServico(servico);
            return true;
        }
        return false;
    }

    /**
     * Regista um tipo de serviço
     *
     * @param tiposervico Tipo de serviço
     * @return TRUE se o tipo de serviço for registado, FALSE caso contrário
     */
    public boolean registaTipoServico(TipoServico tiposervico) {
        if (this.valida(tiposervico)) {
            adicionaTipoServico(tiposervico);
            return true;
        }
        return false;
    }

    /**
     * Regista uma convenção
     *
     * @param convencao Convencao
     * @return TRUE se o tipo de serviço for registado, FALSE caso contrário
     */
    public boolean registaConvencao(Convencao convencao) {
        if (this.valida(convencao)) {
            adicionaConvencao(convencao);
            return true;
        }
        return false;
    }

    /**
     * Adiciona um serviço à lista de serviços
     *
     * @param servico Serviço
     */
    private void adicionaServico(Servico servico) {
        lstServicos.add(servico);
    }

    /**
     * Adiciona um Tipo serviço à lista de tipos de serviços
     *
     * @param tiposervico Tipo serviço
     */
    private void adicionaTipoServico(TipoServico tiposervico) {
        lstTipoServicos.add(tiposervico);
    }

    /**
     * Adiciona uma convenção à lista de convenções
     *
     * @param convencao Convencao
     */
    private void adicionaConvencao(Convencao convencao) {
        lstConvencoes.add(convencao);
    }
    
    /**
     * Adiciona um médico à lista de médicos
     *
     * @param convencao Convencao
     */
    private void adicionaMedico(Medico medico) {
        lstMedicos.add(medico);
    }

    /**
     * Valida o serviço globalmente
     *
     * @param servico Serviço
     * @return TRUE se o serviço for validado, FALSE caso contrário
     */
    // Validação global
    public boolean valida(Servico servico) {
        boolean resp = false;
        if (servico.valida()) {
            // Escrever aqui o código de validação

            //
            resp = true;
        }
        return resp;
    }

    /**
     * Valida o tipo de serviço globalmente
     *
     * @param tiposervico Tipo de Serviço
     * @return TRUE se o tipo deserviço for validado, FALSE caso contrário
     */
    // Validação global
    public boolean valida(TipoServico tiposervico) {
        boolean resp = false;
        if (tiposervico.valida()) {
            // Escrever aqui o código de validação

            //
            resp = true;
        }
        return resp;
    }

    /**
     * Valida a convencao globalmente
     *
     * @param convencao Convencao
     * @return TRUE se a convencao for validada, FALSE caso contrário
     */
    // Validação global
    public boolean valida(Convencao convencao) {
        boolean resp = false;
        if (convencao.valida()) {
            // Escrever aqui o código de validação

            //
            resp = true;
        }
        return resp;
    }

    /**
     * Devolve a lista de especialidades
     *
     * @return Lista de especialidades
     */
    public List<Especialidade> getLstEspecialidades() {
        return lstEspecialidades;
    }

    /**
     * Devolve a lista de serviços
     *
     * @return Lista de serviços
     */
    public List<Servico> getLstServicos() {
        return lstServicos;
    }

    /**
     * Devolve a lista de tipos de serviço
     *
     * @return Lista de tipos de serviço
     */
    public List<TipoServico> getLstTipoServicos() {
        return lstTipoServicos;
    }

    /**
     * Devolve a lista das convenções
     *
     * @return Lista de convenções
     */
    public List<Convencao> getLstConvencoes() {
        return lstConvencoes;
    }

    /**
     * Procura um tipo de serviço pelo id desse tipo de serviço
     * @param id Código do tipo de serviço
     * @return Tipo de serviço
     */
    public TipoServico getTipoServicoPorID(int id) {
        TipoServico tipoServico = new TipoServico();
        for (TipoServico tS : lstTipoServicos) {
            if (tS.getId() == id) {
                tipoServico = tS;
            }
        }
        return tipoServico;
    }
     public Especialidade getEspecialidadePorCod(int cod) {
        Especialidade especialidade = new Especialidade();
        for (Especialidade eS : lstEspecialidades) {
            if (eS.getCodEspecialidade()== cod) {
                especialidade = eS;
            }
        }
        return especialidade;
    }

    public Medico novoMedico() {
        return new Medico();
    }
}
