package controller;

import java.util.List;
import model.Especialidade;
import model.MaisSaude;
import model.Medico;
import utils.Data;

/**
 * Controller da classe Médico
 */
public class RegistarMedico_Controller {

    /**
     * Representa a clínica MaisSaude
     */
    private final MaisSaude clinica;
    private Especialidade especialidade;
    private Medico medico;

    /**
     * Cria a clínica
     *
     * @param clinica Clínica MaisSaude
     */
    public RegistarMedico_Controller(MaisSaude clinica) {
        this.clinica = clinica;

    }

    /**
     * Cria um novo médico
     */
    public void novoMedico() {
        this.medico = clinica.novoMedico();
    }

    /**
     * Define os dados da especialidade
     *
     * @param codigo O código do médico
     * @param nome O nome do médico
     * @param DataContratacao A data de contratação
     * @param NIF O NIF
     * @param cedulaProf A cédula profissional
     * @param email O email
     * @param contato O contato
     */
    public void setDados(int codigo, String nome, Data DataContratacao, int NIF, int cedulaProf, String email, int contato) {
        this.medico.setCodigo(codigo);
        this.medico.setNome(nome);
        this.medico.setDataContratacao(DataContratacao);
        this.medico.setNIF(NIF);
        this.medico.setCedulaProf(cedulaProf);
        this.medico.setEmail(email);
        this.medico.setContato(contato);
    }

    /**
     * Devolve o código da especialidade
     *
     * @return Código da especialidade
     */
    public int getCodEspecialidade(Especialidade especialidade) {
        return this.especialidade.getCodEspecialidade();
    }

    /**
     * Regista a especialidade
     *
     * @return Especialidade
     */
    public boolean registaMedico() {
        return this.clinica.registaMedico(this.medico);
    }

    /**
     * Devolve a descrição atual da especialidade
     *
     * @return Descrição atual da especialidade
     */
    public String getEspecialidadeAsString() {
        return this.especialidade.toString();
    }

    /**
     * Deolve lista de especialidades
     * @return Lista de especialidades
     */
    public List<Especialidade> getLstEspecialidades() {
        return this.clinica.getLstEspecialidades();
    }

    /**
     * Define a especialidade
     * @param especialidade Especialidade
     */
    public void setEspecialidade(Especialidade especialidade) {
        this.medico.setEspecialidade(especialidade);
    }

    /**
     * Adiciona a especialidade através do código da especialidade
     * @param cod Código da especialidade
     * @return Especialidade
     */
    public Especialidade adicionarEspecialidade(int cod) {
        Especialidade especialidade = clinica.getEspecialidadePorCod(cod);
        medico.setEspecialidade(especialidade);
        return especialidade;
    }
    
    /**
     * Devolve a descrição atual do médico
     * @return Descrição atual do médico
     */
    public String getMedicoAsString() {
        return this.medico.toString();
    }
}
