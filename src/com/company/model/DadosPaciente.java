package com.company.model;

public class DadosPaciente {

    private String nome;

    private String cpf;

    private String dataEntrada;

    private int idade;

    private DadosEndereco endereco;

    private DadosSintomas sintomas;

    private DadosContato contato;

    public DadosContato getContato() {
        return contato;
    }

    public void setContato(DadosContato contato) {
        this.contato = contato;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public DadosEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(DadosEndereco endereco) {
        this.endereco = endereco;
    }

    public DadosSintomas getSintomas() {
        return sintomas;
    }

    public void setSintomas(DadosSintomas sintomas) {
        this.sintomas = sintomas;
    }
}
