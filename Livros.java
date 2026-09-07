import java.util.ArrayList;

public class Livros {
    private String titulo;
    private ArrayList<Autoria>autorias;

    public Livros(String titulo) {
        this.titulo = titulo;
        this.autorias = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }
    public void adicionarAutoria(Autoria autoria){
        autorias.add(autoria);
    }
    public void listarAutores(){
        for(Autoria a : autorias){
            System.out.println("- " + a.getAutor().getNome()+ " " + a.getPapel());
        }
    }

}
