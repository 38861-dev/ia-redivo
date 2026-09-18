package model;

public class Violao extends InstrumentoMusical {
    private int cordas;

    public Violao(String nome, String material, int cordas) {
        super(nome, material);
        this.cordas = cordas;
    }

    @Override
    public String tocar() {
        return "Som de cordas dedilhadas.";
    }

    public int getCordas() {
        return cordas;
    }
}
