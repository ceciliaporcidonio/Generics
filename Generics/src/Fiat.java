import java.util.ArrayList;
import java.util.List;

public class Fiat extends Carro {
    private List<String> modelos;

    public Fiat() {
        super("Fiat");
        modelos = new ArrayList<>();
        modelos.add("Uno");
        modelos.add("Mobi");
        modelos.add("Toro");
    }

    @Override
    public void exibirModelos() {
        System.out.println("Modelos da " + getMarca() + ": " + modelos);
    }
}
