package ExercicioPolimorfismo.Ex01;

public class Principal {
    
    public void main(String[] args) {
        
        CalculadoraDeArea q1 = new CalculadoraDeArea();
        System.out.println("O valor da Area de um quadrado é :" + q1.calcularArea(5)+"cm²");

        CalculadoraDeArea r1 = new CalculadoraDeArea();
        System.out.println("O valor de um retangulo é :" + r1.calcularArea(8, 4)+"cm");

        CalculadoraDeArea c1 = new CalculadoraDeArea();
        System.out.println("Area de um círculo :" + String.format("%.2f", c1.calcularArea(3.0))+"cm²");

    }
}
