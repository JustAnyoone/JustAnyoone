package POO;

public class att3 {
    public static void main(String[] args) {
       Att3_contaBancaria cb = new Att3_contaBancaria();
       
        cb.numero = 001002000304;
        cb.nome = "Alessandro Borges";
        cb.saldo = 1000 ;

        cb.depositar();
        cb.sacar();
        cb.consultarSaldo();

    }
    
}
