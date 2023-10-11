package com.trabalho3;

public class AnoSemestre {
    private int ano;
    private int semestre;

    protected AnoSemestre(int ano, int semestre) {
        this.ano = ano;
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    protected void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}
