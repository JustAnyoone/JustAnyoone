package ExercicioDeAgregacaoEComposicao.Ex04;

public class Main {
    public static void main(String[] args) {
        
        // 1. Criando o Produto (associação/agregação, pois o produto existe de forma independente)
        Produto produto1 = new Produto("Teclado Mecânico", 250.00);

        // 2. Criando o Pedido, que gera o seu ItemPedido internamente (Composição)
        Pedido meuPedido = new Pedido(produto1, 2);

        // 3. Exibindo o resumo e o valor total do pedido
        meuPedido.exibirResumo();
    }
}
