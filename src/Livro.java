public class Livro{
    private String titulo;
    private String autor;
    private boolean Disponivel;
    static int TotalLivros = 0;

    public String getTitulo(){ return titulo;}
    public String getAutor(){ return autor;}
    public boolean isDisponivel(){
        return Disponivel;
    }

    public Livro(){
        this("sem titulo", "sem autor");
    }
    public Livro(String Titulo, String Autor){
        this.titulo = Titulo;
        this.autor =  Autor;
        this.Disponivel = true;
        TotalLivros ++;
    }
    public void exibir(){
        System.out.println("Titulo do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
        System.out.println("O livro está disponivel ? "+ Disponivel);
    }
    public void emprestarLivro(){
        if(Disponivel){
            System.out.println("Livro emprestado");
            Disponivel = false;
        }
        else System.out.println("Esse livro ja foi emprestado");
    }
    static int getTotalLivros(){
        return TotalLivros;
    }
    public void devolver(){
        System.out.println("O livro foi devolvido");
        Disponivel = true;
    }
    public void exibirFicha(){
        System.out.println("Titulo do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
        if(Disponivel){
            System.out.println("Livro disponível");
        }
        else System.out.println("Livro emprestado");
    }

}
