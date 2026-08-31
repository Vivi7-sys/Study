import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador>jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador){ // Agregação
        this.jogadores.add(jogador);
    }
    public void listarJogadores(){
        System.out.println("Lista dos Jogadores");
        for(Jogador jogador : this.jogadores){
            System.out.println("Nome: " + jogador.getNome() + "\n Número da camisa: " + jogador.getNumero_Camisa());
        }
    }


}
