import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(new Fiat());
        listaDeCarros.add(new Honda());
        listaDeCarros.add(new Peugeot());

        for (Carro carro : listaDeCarros) {
            carro.exibirModelos();
        }
    }
}
