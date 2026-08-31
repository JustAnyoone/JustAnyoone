package ExercicioAbstracao;

public class Att5 {
    public static void main(String[] args) {

        Att5_Computador computador = new Att5_Computador();

        computador.marca = "Apple";
        computador.modelo = "MacBook Air 13";
        computador.processador = "Chip M4";
        computador.RAM = 16;
        computador.armazenamneto = 256;
        computador.power = false; //Computador(notebook) desligado

        computador.ligar();
        // computador.desligar();
        computador.exibirConfig();
    }
}
