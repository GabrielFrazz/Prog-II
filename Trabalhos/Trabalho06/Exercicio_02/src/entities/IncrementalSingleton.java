package entities;

public class IncrementalSingleton {

    private static int count = 0;
    private int numero;
    private static IncrementalSingleton instancia = null;

    private IncrementalSingleton() {
        numero = ++count;
    }

    public static IncrementalSingleton getInstancia() {
        if (instancia == null) {
            instancia = new IncrementalSingleton();
            return instancia;
        }
        return instancia;
    }

    @Override
    public String toString() {
        return "Incremental: "
                + numero;
    }
}