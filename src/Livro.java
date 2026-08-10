public class Livro{
    String titulo;
    String autor;
    boolean disponivel;
    static int TotalLivros = 0;


    public Livro(){
        this("sem titulo", "sem autor");
    }
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor =  autor;
        this.disponivel = disponivel;
        TotalLivros ++;
    }
    public void exibir(){
        System.out.println("Titulo do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
        System.out.println("O livro está disponivel ? "+ disponivel);
    }
    public void emprestarLivro(){
        if(disponivel){
            System.out.println("Livro emprestado");
            disponivel = false;
        }
        else System.out.println("Esse livro ja foi emprestado");
    }
    static int getTotalLivros(){
        return TotalLivros;
    }
    public void devolver(){
        System.out.println("O livro foi devolvido");
        disponivel = true;
    }
    public void exibirFicha(){
        System.out.println("Titulo do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
        if(disponivel){
            System.out.println("Livro disponível");
        }
        else System.out.println("Livro emprestado");
    }

}
