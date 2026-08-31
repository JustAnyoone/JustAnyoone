package ExercicioAbstracao;
//exercício 3 || att3
import java.util.Scanner; // Importando o INPUT para o JAVA
public class Att3_contaBancaria {
    Scanner input = new Scanner(System.in);

    double numero;
    String nome;
    int saldo;
//------------------------------------------------------------------
    public void depositar(){
        System.out.print("Qual o valor o senhor(a) deseja depositar ?");
        int depositar = input.nextInt();
        saldo = saldo + depositar ;
        System.out.println("Deposito feito com sucesso, saldo atual : " + saldo + "R$");
    }
//------------------------------------------------------------------
    public void sacar(){
        System.out.print("Qual valor deseja sacar ?");
        int saque = input.nextInt(); //Guarda o valor da variavel 'saque'
        if (saque > saldo) {
            System.out.println("O valor de :" + saque + "R$ nao pode ser sacado por falta de saldo na conta");
        }
        else {
            saldo = saldo - saque;
            System.out.println("O valor de :"+ saque + "R$ foi retirado da conta");
        }
    }
//------------------------------------------------------------------
    public void consultarSaldo(){
        System.out.println("O seu saldo atual é de :" + saldo + "R$");
    }
}
