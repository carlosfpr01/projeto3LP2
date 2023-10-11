package com.trabalho3;

import java.util.List;

public class Aluno {
    private String cpf;
    private String nome;

    public Aluno(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public List<Matricula> getMatriculas() {
        return matricula;
    }

    protected void adicionaMatricula(Matricula m) {
        matricula.add(m);
    }
}
