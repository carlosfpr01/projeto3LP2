package projeto3;

import java.util.List; 
import java.util.ArrayList;

public class NotaDisciplina {
    private float nota;

    protected NotaDisciplina(float n, Disciplina d, Situacao s) {
        this.nota = n;
        this.setDisciplina(d);
    }

    public float getNota() {
        return nota;
    }

    public Disciplina getDisciplina() {
        return this.getDisciplina();
    }

    public Situacao getSituacao() {
        return this.getSituacao();
    }

    public AnoSemestre getAnoSemestre() {
        return this.getAnoSemestre();
    }

    protected void setAnoSemestre(AnoSemestre as) {
        this.setAnoSemestre(as);
    }

    protected void setDisciplina(Disciplina d) {
        Disciplina disciplina = new Disciplina(d.getCodigo(), d.getNome(), d.getCargaHoraria());
    }
}
