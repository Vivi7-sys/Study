public class BibliotecaApp{
    public static void main(String[] args){
        Livro livro1 = new Livro("Admirável Mundo Novo", "Aldous Huxley");
        Livro livro2 = new Livro("Metamorfose", "Franz Kafka");
        Livro livro3 = new Livro();
        livro3.exibirFicha();
        System.out.println();
        livro2.exibirFicha();
        livro2.emprestarLivro();
        System.out.println();
        livro1.exibirFicha();
        livro1.emprestarLivro();
        livro1.devolver();
        System.out.println("\nTotal de livros: " + Livro.getTotalLivros());

    }
}
