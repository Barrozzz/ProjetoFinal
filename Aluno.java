package ProjetoFinal;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Nota> notas;
    private List<Frequencia> frequencias;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
        this.frequencias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarNota(Nota nota) {
        notas.add(nota);
    }

    public void adicionarFrequencia(Frequencia frequencia) {
        frequencias.add(frequencia);
    }

    public void mostrarNotas() {
        for (Nota nota : notas) {
            System.out.println("Nota: " + nota.getValor());
        }
    }

    public void mostrarFrequencias() {
        for (Frequencia freq : frequencias) {
            System.out.println("Presença: " + freq.isPresenca());
        }
    }
}

