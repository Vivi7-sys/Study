public class Autoria {
    private Autor Autor;
    private Livros Livro;
    private String papel;

    public Autoria(Autor autor, Livros Livro, String papel) {
        this.Autor = autor;
        this.Livro = Livro;
        this.papel = papel;
    }

    public Autor getAutor() {
        return Autor;
    }

    public Livros getLivro() {
        return Livro;
    }

    public String getPapel() {
        return papel;
    }

    public static Autoria autorar(Autor autor, Livros Livro, String papel){
        Autoria a = new Autoria(autor,Livro,papel);
        autor.adicionarAutoria(a);
        Livro.adicionarAutoria(a);
        return a;
    }

}
