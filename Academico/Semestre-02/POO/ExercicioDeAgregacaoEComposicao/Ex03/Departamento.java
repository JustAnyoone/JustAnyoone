package ExercicioDeAgregacaoEComposicao.Ex03;

public class Departamento {
    private String nome;
    private Professor professor; // Agregação: o professor é associado externamente

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void exibirInformacoes() {
        System.out.println("Departamento: " + nome);
        if (professor != null) {
            System.out.print("  -> ");
            professor.exibirInformacoes();
        } else {
            System.out.println("  -> Nenhum professor alocado no momento.");
        }
    }
}
