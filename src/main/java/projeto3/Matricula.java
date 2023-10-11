package projeto3; 

import java.util.List;
import java.util.ArrayList;

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
        return this.listAnoSemestres();
    }

    public void registraAnoSemestre(int ano, int sem) {
        AnoSemestre anoSemestre = new AnoSemestre(ano, sem, this);
    }

    public void setAluno(Aluno a) {
        Aluno aluno = new Aluno(a.getCpf(), a.getNome());
    }

    public void setCurso(Curso c) {
        Curso curso = new Curso();
    }

}
