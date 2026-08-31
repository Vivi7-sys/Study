public class Jogador {
    private String nome;
    private int numero_Camisa;

    public Jogador(String nome, int numero_Camisa) {
        this.nome = nome;
        this.numero_Camisa = numero_Camisa;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero_Camisa() {
        return numero_Camisa;
    }
}
