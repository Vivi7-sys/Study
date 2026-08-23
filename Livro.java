public class Livro{
    public String titulo;
    public String autor;
    public boolean disponivel;
    public static int TotalLivros;


    public Livro(){
        this("sem titulo", "sem autor");
    }
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor =  autor;
        this.disponivel = true;
        TotalLivros ++;
    }
    public void exibir(){
        System.out.println("Titulo do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
        System.out.println("O livro está disponivel ? "+ disponivel);
    }
    static int getTotalLivros(){
        return Livro.TotalLivros;
    }
    public void emprestarLivro(){
        if(this.disponivel){
            System.out.println("Livro emprestado");
            this.disponivel = false;
        }
        else System.out.println("Esse livro ja foi emprestado");
    }
    public void devolver(){
        System.out.println("O livro foi devolvido");
        this.disponivel = true;
    }
    public void exibirFicha(){
        System.out.println();
        System.out.println("Titulo do livro: " + this.titulo + "\nAutor do livro: " + this.autor+ (this.disponivel ? "\nDisponivel" : "Emprestado"));

    }

}