public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public int calcularArea(){
        return (int) (Math.PI * raio * raio);
    }
}
