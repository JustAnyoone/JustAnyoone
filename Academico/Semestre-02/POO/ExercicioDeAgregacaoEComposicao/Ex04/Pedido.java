package ExercicioDeAgregacaoEComposicao.Ex04;

public class Pedido {

    private ItemPedido itemPedido; // Composição: o item do pedido pertence estritamente a este Pedido

    // No construtor, instanciamos o ItemPedido internamente para caracterizar a composição
    public Pedido(Produto produto, int quantidade) {
        this.itemPedido = new ItemPedido(produto, quantidade);
    }

    public double calcularTotal() {
        return itemPedido.getSubtotal();
    }

    public void exibirResumo() {
        System.out.println("=== Detalhes do Pedido ===");
        System.out.println("Produto: " + itemPedido.getProduto().getNome());
        System.out.println("Preço Unitário: R$ " + String.format("%.2f", itemPedido.getProduto().getPreco()));
        System.out.println("Quantidade: " + itemPedido.getQuantidade());
        System.out.println("---------------------------");
        System.out.println("Valor Total do Pedido: R$ " + String.format("%.2f", calcularTotal()));
    }
    
}
