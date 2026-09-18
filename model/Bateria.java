package model;

public class Bateria extends InstrumentoMusical {
    private int tambores;

    public Bateria(String nome, String material, int tambores) {
        super(nome, material);
        this.tambores = tambores;
    }

    @Override
    public String tocar() {
        return "Som grave de batidas.";
    }

    public int getTambores() {
        return tambores;
    }
}
