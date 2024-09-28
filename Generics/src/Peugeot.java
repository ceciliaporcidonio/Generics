import java.util.ArrayList;
import java.util.List;

public class Peugeot extends Carro {
    private List<String> modelos;

    public Peugeot() {
        super("Peugeot");
        modelos = new ArrayList<>();
        modelos.add("206");
        modelos.add("208");
    }

    @Override
    public void exibirModelos() {
        System.out.println("Modelos da " + getMarca() + ": " + modelos);
    }
}
