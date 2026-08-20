public class FuncionarioApp {
    public static void main (String[] args){
        Funcionario jao = new Funcionario();
        Funcionario jamal = new Funcionario("jamal", 0, 44);

        jao.setNome("Jao");
        jao.setSalario(67);
        jao.setCargaHorariaSemanal(23);
        System.out.println();
        jamal.exibir();
        System.out.println();
        jao.exibir();


    }
}
