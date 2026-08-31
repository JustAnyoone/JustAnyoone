package ExercicioAbstracao;

public class Att4 {
    public static void main(String[] args) {
        att4_livro livro = new att4_livro();

        livro.titulo = "Entendo algoritmos";
        livro.autor = "Aditya Y.Bhargava";
        livro.ano = (2017);
        livro.numPag = (263);
        livro.disponibilidade = false; // false caso o livro nao esteja disponivel 

        // livro.exibirInfos();
        
        livro.devolver();
        livro.emprestar();
    }
}
