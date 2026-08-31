package ExercicioHeranca.Ex02;

public class Main {
    public static void main(String[] args) {
        
        Cachorro c1 = new Cachorro();
        System.out.println(c1.nome = "Joao");
        System.out.println(c1.idade = 10);
        System.out.println(c1.peso = 10.00);
        System.out.println(c1.raca = "Bulldog Frances");

        System.out.println("-----------------------------------------------------------");

        Gato g1 = new Gato();
        System.out.println(g1.nome = "Belinha");
        System.out.println(g1.idade = 4);
        System.out.println(g1.peso = 10.00);
        System.out.println(g1.corPelo = "Marrom mofado");
        
    }
}
