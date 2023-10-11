package projeto3;

import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nome;

    public void Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public List<Disciplina> getDisciplina() {
        return this.getDisciplina();
    }

    public List<Matricula> getMatriculas() {
        return this.getMatriculas();
    }

    public void incluiDisciplina(Disciplina d) {
        Disciplina disciplina = new Disciplina(d.getCodigo(), d.getNome(), d.getCargaHoraria());
    }
}
