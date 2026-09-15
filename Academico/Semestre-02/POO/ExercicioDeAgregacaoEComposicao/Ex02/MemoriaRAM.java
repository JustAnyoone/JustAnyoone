package ExercicioDeAgregacaoEComposicao.Ex02;

public class MemoriaRAM {

    private int capacidade;
    private String tipo;

    public MemoriaRAM(int capacidade, String tipo) {
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public void exibirDetalhes(){
        System.out.println("Memoria RAM: " + capacidade + ", GB: " + tipo);
    }

}
