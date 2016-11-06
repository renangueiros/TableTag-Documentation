/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tabletag.modelos;

/**
 *
 * @author Renan
 */
public class Pessoas {

    private int cpf;
    private String nome;
    private int identidade;
    private String dataNascimento;
    private String escolaridade;
    private String endereco;
    private String telefone;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentidade() {
        return identidade;
    }

    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoas(int cpf, String nome, int identidade, String dataNascimento, String escolaridade, String endereco, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.identidade = identidade;
        this.dataNascimento = dataNascimento;
        this.escolaridade = escolaridade;
        this.endereco = endereco;
        this.telefone = telefone;
    }

}
