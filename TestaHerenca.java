import java.util.ArrayList;

public class TestaHerenca {
    public static void main (String[] args){
        int acumulador = 0;
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Forma> formas = new ArrayList<>();

        veiculos.add(new Carro("BMW", 2022));
        veiculos.add(new Moto("Kawasaki", 2024));
        formas.add(new Circulo(22.2));
        formas.add(new Retangulo(90, 360));

        for(Veiculo v : veiculos){
            v.exibirDados();
        }

        for (Forma f : formas){
            acumulador += f.calcularArea();
        }
        System.out.println("Soma total das áreas: " + acumulador);
    }
}
