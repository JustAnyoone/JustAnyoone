package ExercicioPolimorfismo.Exercicio2;

public class Main {
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente();
        g1.nome = "Flavio";
        System.out.println("O Gerente "+ g1.nome + " vai receber : " + g1.calcularSalario(3000));

        Estagiario e1 = new Estagiario();
        e1.nome = "Cleiton";
        System.out.println("O estagiario "+ e1.nome + " vai receber : " + e1.calcularSalario(3000));

        Funcionario f1 = new Funcionario();
        f1.nome = "Pedro";
        System.out.println("O funcionario "+ f1.nome + " vai receber : " + f1.salario);
    }
}
