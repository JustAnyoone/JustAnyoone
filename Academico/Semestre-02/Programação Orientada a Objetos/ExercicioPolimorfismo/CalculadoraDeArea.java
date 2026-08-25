package ExercicioPolimorfismo;

public class CalculadoraDeArea {
    
    public int calcularArea(int lado){
        return (lado * lado);
    }

    public int calcularArea(int base, int altura){
        return (base * altura);
    }

    public double calcularArea(double raio){
        return (Math.PI * (raio * raio));
    }
}
