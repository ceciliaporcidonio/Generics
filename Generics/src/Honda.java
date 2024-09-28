import java.util.ArrayList;
import java.util.List;

public class Honda extends Carro {
    private List<String> modelos;

    public Honda() {
        super("Honda");
        modelos = new ArrayList<>();
        modelos.add("Civic");
        modelos.add("CRV");
        modelos.add("HRV");
    }

    @Override
    public void exibirModelos() {
        System.out.println("Modelos da " + getMarca() + ": " + modelos);
    }
}
