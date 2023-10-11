package com.trabalho3;

import java.util.List;

import com.trabalho3.Aluno;

public class Matricula {
    
    private String matricula;
    private int ano;
    private int semestre;

    public Matricula(String m, int ano, int sem, Aluno a, Curso c) {
        this.matricula = m;
        this.ano = ano;
        this.semestre = sem;
        this.setAluno(a);
        this.setCurso(c);
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAno() {
        return ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public Aluno getAluno() {
        return this.getAluno();
    }

    public Curso getCurso() {
        return this.getCurso();
    }

    public List<AnoSemestre> listAnoSemestres() {
        return anoSemestres;
    }

    public void registraAnoSemestre(int ano, int sem) {
        anoSemestres.add(new AnoSemestre(ano, sem, this));
    }

    public void setAluno(Aluno a) {
        this.aluno = a;
    }

    public void setCurso(Curso c) {
        this.curso = c;
    }

}
