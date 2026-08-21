package POO;
//Exercício 1 || att1
public class Att1_Celular {
    String marca;
    String modelo;
    String cor;
    int preco;
    int quantidadeGB;
//------------------------------------------------------------------
    public void ligar(){
        System.out.println("Ligado");
    }
//------------------------------------------------------------------
    public void desligar(){
        System.out.println("Desligado");
    }
//------------------------------------------------------------------
    public void exibirInfos(){
        System.err.println(marca +" - "+ modelo +" - "+ cor +" - "+ preco +" - "+ quantidadeGB);
    }
}
