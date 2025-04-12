package AtividadeFisica;

public class Musculacao implements AtividadeFisica {

    public float tempoAtividade;
    public float caloriasGastas;

    public Musculacao() {
    }

    public Musculacao (float tempoAtividade, float caloriasGastas) {
        this.tempoAtividade = tempoAtividade;
        this.caloriasGastas = caloriasGastas;
    }

    public float getTempoTotalExecucao() {
        return tempoAtividade;
    }

    public float getCaloriasGastas() {
        return caloriasGastas;
    }

    public String getNomeAtividade() {
        return "Musculação";
    }

}
