package POO;
//Exercício 2 || att2
public class att2_Aluno {
    String nome;
    int idade;
    String curso;
    double notaFinal; //double por conta que geralmente notas ficam em formato (10.00 || 09.50)
//------------------------------------------------------------------
    public void estudar(){
        System.out.println(nome + " está estudando"); //var (nome) esta estudando
    }
//------------------------------------------------------------------
    public void fazerProva(){
        System.out.println(nome + " realizou a prova");
    }
//------------------------------------------------------------------
    public void verificarSituacao(){
        //maior ou igual a 6 aprovado
        //menor que 6 reprovado
        if (notaFinal >= 6){
            System.out.println(nome + " esta aprovado");
        }
        else{
            System.out.println(nome + " esta reprovado");
        }
    }
}
