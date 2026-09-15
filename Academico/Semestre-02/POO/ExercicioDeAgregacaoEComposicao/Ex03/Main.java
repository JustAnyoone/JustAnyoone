package ExercicioDeAgregacaoEComposicao.Ex03;

public class Main {
    public static void main(String[] args) {
        // 1. Criando o Professor de forma independente (Agregação)
        Professor prof = new Professor("Dr. Carlos Eduardo", "Inteligência Artificial");

        // 2. Criando a Universidade, que automaticamente cria seu Departamento (Composição)
        Universidade uni = new Universidade("Universidade Tecnológica", "Departamento de Computação");

        // 3. Associando o Professor existente ao Departamento da Universidade
        uni.getDepartamento().setProfessor(prof);

        // 4. Exibindo a estrutura completa
        uni.exibirInformacoes();
    }
}
