package ExercicioDeAgregacaoEComposicao.Ex02;

public class Computador {

    private Processador processador;
    private MemoriaRAM memoriaRAM;
    
    public Computador(String marcaProcessador, int freqProcessador, int capRAM, String tipoRAM ) {
        this.processador = new Processador(marcaProcessador, freqProcessador);
        this.memoriaRAM = new MemoriaRAM(capRAM, tipoRAM);
    }

    public void exibirDetalhes(){
        System.out.println("=== Detalhes do computador ===");
        processador.exibirDetalhes();
        memoriaRAM.exibirDetalhes();
    }
}
