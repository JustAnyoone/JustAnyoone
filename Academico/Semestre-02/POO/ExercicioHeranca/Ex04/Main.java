package ExercicioHeranca.Ex04;

public class Main {
    
    public static void main(String[] args) {

        Professor p1 = new Professor();
        System.out.println(p1.nome = "Alessandro Borges");
        System.out.println(p1.matricula = 02312312);
        System.out.println(p1.salario = 15000);
        System.out.println(p1.disciplina = "Banco de Dados");

        System.out.println("------------------------------------");

        Programador pr1 = new Programador();
        System.out.println(pr1.nome = "Fulano");
        System.out.println(pr1.matricula = 1212312312);
        System.out.println(pr1.salario = 2000);
        System.out.println(pr1.linguagem = "Python");
    }
}
