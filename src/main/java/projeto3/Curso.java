package com.trabalho3;

import java.util.List;

public class Curso {
    private String nome;

    public void Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public List<Matricula> getMatriculas() {
        return matricula;
    }

    public void incluiDisciplina(Disciplina d) {
        disciplina.add(d);
    }
}
