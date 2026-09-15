package ExercicioDeAgregacaoEComposicao.Ex02;

public class Processador {

    private String marca;
    private int frequencia;

    public Processador(String marca, int frequencia) {
        this.marca = marca;
        this.frequencia = frequencia;
    }

     public void exibirDetalhes(){
        System.out.println("Marca: " + marca + " frequencia :" + frequencia);
    }

}
