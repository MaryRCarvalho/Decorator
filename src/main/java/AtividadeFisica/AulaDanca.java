package AtividadeFisica;

public class AulaDanca extends AtividadeDecorador{

    public AulaDanca(AtividadeFisica atividadeFisica) {
        super(atividadeFisica);
    }

    @Override
    public float getAdicaoDeTempo() {
        return 45;
    }

    @Override
    public float getAdicaoDeCaloriasGastas() {
        return 200;
    }

    @Override
    public String getNomesAtividades() {
        return "Aula de dança";
    }
}
