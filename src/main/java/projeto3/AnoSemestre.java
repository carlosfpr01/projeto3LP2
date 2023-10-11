package com.trabalho3;

public class AnoSemestre {
    private int ano;
    private int semestre;

    protected AnoSemestre(int ano, int semestre, Matricula m) {
        this.ano = ano;
        this.semestre = semestre;
        getMatricula(m);
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

    public NotaDisciplina registraNotaDisciplina(float n, Disciplina d, Situação s){
        return new NotaDisciplina(n, d, s, this);
    }

    public List<NotaDisciplina> listNotaDisciplina(){
        return notaDisciplina;
    }

    protected void setMatricula(Matricula m) {
        this.matricula = m;
    }
}
