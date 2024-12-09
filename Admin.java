package ProjetoFinal;

public class Admin {
    private String nome;

    public Admin(String nome) {
        this.nome = nome;
    }

    public void alterarDadosAluno(Aluno aluno, String novoNome) {
        System.out.println("Alterando nome do aluno para: " + novoNome);
    }
}
