package POO;

public class att4_livro {
    String titulo;
    String autor;
    int ano;
    int numPag;
    boolean disponibilidade;
//------------------------------------------------------------------
    public void exibirInfos(){
        
        System.out.println("Título:"+ titulo);
        System.out.println("Autor:"+ autor);
        System.out.println("ano de publicação:"+ ano);
        System.out.println("número de páginas:"+ numPag);
        System.out.println("disponibilidade :"+ (disponibilidade ? "ligado" : "desligado"));
        //se for true a na mensagem vai aparecer ligado, se for false vai aparecer desligado
    }
    //------------------------------------------------------------------
    public void emprestar(){
        if (disponibilidade == true){
            disponibilidade = false;
            System.out.println("livro emprestado com sucesso");
        }
        else{
            System.out.println("O livro ja está emprestado");
        }   
    }
    //------------------------------------------------------------------
    public void devolver(){
        disponibilidade = true;
        System.out.println("Disponivel para ser empréstimo");
    }
}
