package AtividadeFisica;

public class AulaSpinning extends AtividadeDecorador{

    public AulaSpinning(AtividadeFisica atividadeFisica) {
        super(atividadeFisica);
    }

    @Override
    public float getAdicaoDeTempo() {
        return 50;
    }

    @Override
    public float getAdicaoDeCaloriasGastas() {
        return 250;
    }

    @Override
    public String getNomesAtividades() {
        return "Aula de Spinning";
    }
}
