package ExercicioAbstracao;

public class att2 {
    public static void main(String[] args) {
        
        att2_Aluno aluno = new att2_Aluno();

        aluno.nome = "Shiokawa";
        aluno.idade = 18;
        aluno.curso = "Gastronomia Asiatica";
        aluno.notaFinal = 10; //mesmo a VAR sendo double pode ser colocado um valor INT "normal"

        aluno.estudar();
        aluno.fazerProva();
        aluno.verificarSituacao();
    }
}

