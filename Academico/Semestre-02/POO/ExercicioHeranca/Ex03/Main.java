package ExercicioHeranca.Ex03;

public class Main {
    public static void main(String[] args) {
        
        Livro l1 = new Livro();
        System.out.println(l1.nome = "Diario de um Banana");
        System.out.println(l1.preco = 20);
        System.out.println(l1.codigo = 010203);
        System.out.println(l1.autor = "Um banana");

        System.out.println("---------------------------------------------");

        Eletronico e1 = new Eletronico();
        System.out.println(e1.nome = "Geladeira 6 portas");
        System.out.println(e1.preco = 2000);
        System.out.println(e1.codigo = 123123123);
        System.out.println(e1.voltagem = 440);
    }   
}
