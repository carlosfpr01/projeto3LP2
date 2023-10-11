package com.trabalho3;

public class NotaDisciplina {
    private float nota;

    protected NotaDisciplina(float nota, Disciplina disciplina) {
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public AnoSemestre getAnoSemestre() {
        return anoSemestre;
    }

    protected void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    protected void setAnoSemestre(AnoSemestre anoSemestre) {
        this.anoSemestre = anoSemestre;
    }
}
