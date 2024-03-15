public class Cuadrado2 extends FigurasGeometricas {
    public Cuadrado2(double valor1){
        super(valor1);
    }
    @Override
    public double getArea(){
        return Math.pow(this.valor1,2);
    }@Override
    public double getPerimetro(){
        return this.valor1*4;
    }
}
