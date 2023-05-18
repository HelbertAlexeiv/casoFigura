package modelo;

public class Circulo extends Figura{
    private double radio;
    public Circulo(double radio){
        this.radio = radio;
    }

    public void calcularAreaPerimetro(){
        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;
    }


}
