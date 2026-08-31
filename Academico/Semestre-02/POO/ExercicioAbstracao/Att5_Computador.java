package ExercicioAbstracao;

public class Att5_Computador {
    String marca;
    String modelo;
    String processador;
    int RAM;
    int armazenamneto;
    boolean power; // true = Ligado , false = DESLIGADO

    public void ligar(){
        if (power == false) {
            power = true;
            System.out.println("Computador foi ligado com sucesso");
        }
        else{System.out.println("Computador já esta ligado");}
    }
//------------------------------------------------------------------
    public void desligar(){
        if (power == true) {
            power = false;
            System.out.println("Computador Desligado com sucesso");
        }
        else{System.out.println("O computador já foi desligado");}
    }
//------------------------------------------------------------------
    public void exibirConfig(){
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:"+ modelo);
        System.out.println("Processador: "+ processador);
        System.out.println("Quantidade de memória RAM:" + RAM + "GB");
        System.out.println("Capacidade de armazenamento:" + armazenamneto + "GB");
        System.out.println("Power:" + (power ? "ligado" : "desligado")); // mensagem abaixo ta explicado
        // se for true a na mensagem vai aparecer ligado, se for false vai aparecer desligado
    }
}
