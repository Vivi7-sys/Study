import java.util.ArrayList;

public class Casa {
    private String endereco;
    private ArrayList<Comodo>comodos;

    public Casa(String endereco) {
        this.endereco = endereco;
        this.comodos = new ArrayList<>();
        this.comodos.add(new Comodo("Sala", 20));
        this.comodos.add(new Comodo("Quarto", 20));
        this.comodos.add(new Comodo("Quintal", 20));
    }
    public void listarComodos(){
        System.out.println("Lista dos Comodos");
        for(Comodo comodo : comodos){
            System.out.println("Nome do comodo: " + comodo.getNome() + "Area por metro quadrado: " + comodo.getAreaM2());
        }
    }

}
