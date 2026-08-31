public class TesteAssociacoes {
    public static void main (String[] args){
        Professor prof = new Professor("Fabio", "Fisica");
        Turma sala = new Turma("E", prof);
        Time Real_Madri = new Time("Real Madri");
        Casa House = new Casa("House White");

        System.out.println("Turma: " + sala.getNome());
        System.out.println("Professor responsável: " + sala.getProfessor().getNome());

        Jogador jogador1 = new Jogador("CR7", 7);
        Jogador jogador2 = new Jogador("R9", 9);
        Jogador jogador3 = new Jogador("Zizu", 5);

        Real_Madri.adicionarJogador(jogador1);
        Real_Madri.adicionarJogador(jogador2);
        Real_Madri.adicionarJogador(jogador3);
        System.out.println("Time Prime do Real: ");
        Real_Madri.listarJogadores();

        House.listarComodos();
    }
}
