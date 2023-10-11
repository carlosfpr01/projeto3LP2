package com.trabalho3;

import java.util.List;

import com.trabalho3.Aluno;

public class Matricula {
    
    private String matricula;
    private int ano;
    private int semestre;

    public Matricula( int ano,  int semestre, Aluno aluno, String matricula, Curso curso) {
        this.matricula = matricula;
        this.ano = ano;
        this.semestre = semestre;
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
        return curso;
    }

    public List<AnoSemestre> listAnoSemestres() {
        return anoSemestres;
    }

    public void addAnoSemestre(int ano, int sem) {
        anoSemestres.add(new AnoSemestre(ano, sem));
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
