package projeto3;

import java.util.List;

public class AnoSemestre {
    private int ano;
    private int semestre;

    protected AnoSemestre(int a, int s, Matricula m) {
        this.ano = a;
        this.semestre = s;
        this.setMatricula(m);
    }

    public int getAno() {
        return ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public Matricula getMatricula() {
        return this.getMatricula();
    }

    public NotaDisciplina registraNotaDisciplina(float n, Disciplina d, Situacao s){
        return new NotaDisciplina(n, d, s);
    }

    public List<NotaDisciplina> listNotaDisciplina(){
        return this.listNotaDisciplina();
    }

    protected void setMatricula(Matricula m) {
        new Matricula(m.getMatricula(), m.getAno(), m.getSemestre(), m.getAluno(), m.getCurso());
    }
}
