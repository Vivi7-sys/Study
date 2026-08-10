public class Livro{
    String titulo;
    String autor;
    boolean disponivel;
    static int TotalLivros = 0;


    public Livro(){
        titulo = "Revolução dos Bichos";
        autor = "George Owell";
        disponivel = true;
        TotalLivros ++;
    }
    public Livro(String titulo, String autor, boolean disponivel){
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
