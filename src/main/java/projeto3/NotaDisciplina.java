package com.trabalho3;

public class NotaDisciplina {
    private float nota;

    protected NotaDisciplina(float n, Disciplina d, Situacao s) {
        this.nota = n;
        this.setDisciplina(d);
        this.setSituacao(s);
    }

    public float getNota() {
        return nota;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public AnoSemestre getAnoSemestre() {
        return anoSemestre;
    }

    protected void setAnoSemestre(AnoSemestre anoSemestre) {
        this.anoSemestre = anoSemestre;
    }

    protected void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
