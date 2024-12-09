package ProjetoFinal;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Enzo");
        Professor professor = new Professor("Curvello");
        Responsavel responsavel = new Responsavel("Cris");
        Admin admin = new Admin("Adm");

        professor.adicionarNota(aluno, new Nota(8.5));
        professor.registrarFrequencia(aluno, new Frequencia(true));

        System.out.println("Notas do Aluno: ");
        responsavel.visualizarNotas(aluno);

        System.out.println("Frequência do Aluno: ");
        responsavel.visualizarFrequencias(aluno);

        admin.alterarDadosAluno(aluno, "Enzo Barros");
    }
}
