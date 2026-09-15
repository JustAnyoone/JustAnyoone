package ExercicioDeAgregacaoEComposicao.Ex01;

public class Main {
    public static void main(String[] args) {
       
        Biblioteca minhaBiblioteca = new Biblioteca("Biblioteca Municipal");

        Livro meuLivro = new Livro("Diario de um banana", "um banana", 2013);
        
        minhaBiblioteca.setLivro(meuLivro);

        minhaBiblioteca.exibirInformacoes();
    }
}
