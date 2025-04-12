package AtividadeFisica;

public abstract class AtividadeDecorador implements AtividadeFisica {

    private AtividadeFisica atividadeFisica;
    public String nomesAtividades;

    public AtividadeDecorador(AtividadeFisica atividadeFisica) {
        this.atividadeFisica = atividadeFisica;
    }

    public AtividadeFisica getAtividadeFisica() {
        return atividadeFisica;
    }

    public void setAtividadeFisica(AtividadeFisica atividadeFisica) {
        this.atividadeFisica = atividadeFisica;
    }

    public abstract float getAdicaoDeTempo();

    public float getTempoTotalExecucao() {
        return this.atividadeFisica.getTempoTotalExecucao() + this.getAdicaoDeTempo();
    }

    public abstract float getAdicaoDeCaloriasGastas();

    public float getCaloriasGastas() {
        return this.atividadeFisica.getCaloriasGastas() + this.getAdicaoDeCaloriasGastas();
    }

    public abstract String getNomesAtividades();

    public String getNomeAtividade() {
        return this.atividadeFisica.getNomeAtividade() + " " + this.getNomesAtividades();
    }

    public void setNomeAtividade(String nomesAtividades) {
        this.nomesAtividades = nomesAtividades;
    }
}
