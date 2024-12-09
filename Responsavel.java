package ProjetoFinal;

public class Responsavel {
    private String nome;

    public Responsavel(String nome) {
        this.nome = nome;
    }

    public void visualizarNotas(Aluno aluno) {
        aluno.mostrarNotas();
    }

    public void visualizarFrequencias(Aluno aluno) {
        aluno.mostrarFrequencias();
    }
}

