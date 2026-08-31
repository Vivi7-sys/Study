public class Turma {
    private String nome;
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Turma(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }
}
