package ExercicioDeAgregacaoEComposicao.Ex01;

public class Biblioteca {

    private String nome;
    private Livro livro;

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void exibirInformacoes() {
        System.out.println("Biblioteca: " + nome);
        if (livro != null) {
            System.out.print("Livro no acervo: ");
            livro.exibirInformacoes();
        } else {
            System.out.println("Nenhum livro associado no momento.");
        }
    }
}
