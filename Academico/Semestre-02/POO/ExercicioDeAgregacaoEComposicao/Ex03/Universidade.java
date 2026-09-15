package ExercicioDeAgregacaoEComposicao.Ex03;

public class Universidade {

    private String nome;
    private Departamento departamento; // Composição: o departamento pertence à universidade

    public Universidade(String nomeUniversidade, String nomeDepartamento) {
        this.nome = nomeUniversidade;
        // Instanciação interna: o departamento nasce com a universidade
        this.departamento = new Departamento(nomeDepartamento);
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void exibirInformacoes() {
        System.out.println("=== Universidade: " + nome + " ===");
        departamento.exibirInformacoes();
    }
    
}
