package modelo;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void calcularAreaPerimetro(){
        area = base * altura;
        perimetro = 2*base + 2*altura;
    }
}
