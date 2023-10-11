package com.trabalho3;

public class Curso {
    private String nome;

    public Curso(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public List<Matricula> getMatriculas() {
        return matricula;
    }
    
    public Disciplina getDisciplina() {
        return disciplina;
    }
    
}
