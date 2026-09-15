package ExercicioDeAgregacaoEComposicao.Ex03;

public class Professor {
    
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void exibirInformacoes() {
        System.out.println("Professor: " + nome + " | Especialidade: " + especialidade);
    }
}
