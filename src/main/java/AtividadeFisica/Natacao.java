package AtividadeFisica;

public class Natacao extends AtividadeDecorador{

    public Natacao(AtividadeFisica atividadeFisica) {
        super(atividadeFisica);
    }

    @Override
    public float getAdicaoDeTempo() {
        return 40;
    }

    @Override
    public float getAdicaoDeCaloriasGastas() {
        return 100;
    }

    @Override
    public String getNomesAtividades() {
        return "Aula de natação";
    }
}
