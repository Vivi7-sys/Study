public class TestaAssociacaoNN {
    public static void main(String[] args){
        Livros livro  = new Livros("Revolução dos bichos");
        Autor  autor  = new Autor("George Orwell");
        Livros livro2 = new Livros("Laranja mecanica");
        Autor  autor2 = new Autor("Anthony Burgess");
        Filme  filme  = new Filme("Donnie Darko");
        Ator   ator   = new Ator("Jake Gyllenhaal");
        Filme  filme2 = new Filme("Trem bala");
        Ator   ator2  = new Ator("Brad Pitt");

        Autoria.autorar(autor, livro,"Autor principal");
        Autoria.autorar(autor2, livro2,"Autor Principal");
        Atuacao.atuar(ator,filme, "Donnie");
        Atuacao.atuar(ator2,filme2, "LadyBug");

        livro.listarAutores();
        livro2.listarAutores();
        filme.listarElenco();
        filme2.listarElenco();



    }
}
