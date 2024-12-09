package ProjetoFinal;

public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(Aluno aluno, Nota nota) {
        aluno.adicionarNota(nota);
    }

    public void registrarFrequencia(Aluno aluno, Frequencia frequencia) {
        aluno.adicionarFrequencia(frequencia);
    }
}
