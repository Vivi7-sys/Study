public class Funcionario {
    private String nome;
    private double salario;
    private int cargaHorariaSemanal;

    //setters
    public void setNome(String nome){
        if(nome.isEmpty() || nome.length() > 50){
            System.out.println("Nome Inválido!");
        }
        else{
            this.nome = nome;
        }
    }
    public void setSalario(double salario){
        if(salario >= 0){
            this.salario = salario;
        }
        else{
            System.out.println("Salario Inválido!");
        }
    }
    public void setCargaHorariaSemanal(int cargaHorariaSemanal){
        if(cargaHorariaSemanal >= 1 && cargaHorariaSemanal <= 44){
            this.cargaHorariaSemanal = cargaHorariaSemanal;
        }
        else {
            System.out.println("Carga horaria invalida!");

        }
    }
    // getters
    public String getnome(){ return this.nome = nome;}
    public double getSalario(){ return this.salario = salario;}
    public int getCargaHorariaSemanal(){ return  this.cargaHorariaSemanal = cargaHorariaSemanal;}

    // exibir dados
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Carga Horaria Semanal: " + cargaHorariaSemanal);
    }

    // construtor
    public Funcionario(String nome, double salario, int cargaHorariaSemanal){
        setNome(nome);
        setSalario(salario);
        setCargaHorariaSemanal(cargaHorariaSemanal);

    }
    // construtor padrão
    public Funcionario (){
        this("Sem nome", 0.0, 1);
    }



}
