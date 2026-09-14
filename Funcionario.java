public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario() {
        this("sem nome",0);
    }
    public Funcionario(String nome, double salario) {
        this.salario = salario;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularBonus(){
        return this.salario = this.salario * 0.15; // 15% de bonus
    }
    public void exibirDados(){
            System.out.printf("Nome: %s Salario: %.2f Bonus: %.2f Total a receber: %.2f%n",
                    this.nome, this.salario, this.calcularBonus(), (this.calcularBonus() + this.salario));

    }
}
