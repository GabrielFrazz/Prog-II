package entities;

public class IntegerSet {

    private static final int max = 51; // conj [0,50]
    private final boolean[] set = new boolean[max];

    public IntegerSet() {
        for (int i = 0; i < max; i++) {
            set[i] = false;
        }
    }

    public IntegerSet uniao(IntegerSet set01, IntegerSet set02) {
        IntegerSet setOut = new IntegerSet();
        for (int i = 0; i < max; i++) {
            if (set01.set[i] == true || set02.set[i] == true) {
                setOut.set[i] = true;
            }
        }
        return setOut;
    }

    public IntegerSet intersecao(IntegerSet set01, IntegerSet set02) {
        IntegerSet setOut = new IntegerSet();
        for (int i = 0; i < max; i++) {
            if (set01.set[i] == true && set02.set[i] == true) {
                setOut.set[i] = true;
            }
        }
        return setOut;
    }

    public IntegerSet diferencaAB(IntegerSet set01, IntegerSet set02) {
        IntegerSet setOut = new IntegerSet();
        for (int i = 0; i < max; i++) {
            if (set01.set[i] == true && set02.set[i] == false) {
                setOut.set[i] = true;
            }
        }
        return setOut;
    }

    public IntegerSet diferencaBA(IntegerSet set01, IntegerSet set02) {
        IntegerSet setOut = new IntegerSet();
        for (int i = 0; i < max; i++) {
            if (set01.set[i] == false && set02.set[i] == true) {
                setOut.set[i] = true;
            }
        }
        return setOut;
    }

    public void adicionarElemento(int elemento) {
        set[elemento] = true;
    }

    public void retirarElemento(int elemento) {
        set[elemento] = false;
    }

    @Override
    public String toString() {

        boolean conjVazio = true;

        StringBuilder stringFinal = new StringBuilder();
        stringFinal.append("{ ");

        for (int i = 0; i < max; i++) {
            if (set[i]) {
                conjVazio = false;
                stringFinal.append(i).append(' ');
            }
        }

        return conjVazio ? "---" : stringFinal.append('}').toString();
    }

}