import AtividadeFisica.AtividadeFisica;
import AtividadeFisica.Musculacao;
import AtividadeFisica.AulaSpinning;
import AtividadeFisica.AulaDanca;
import AtividadeFisica.Natacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AtividadeFisicaTeste {

    @Test
    void deveRetornarTempoAtividade() {

        AtividadeFisica atividadeFisica = new Musculacao(90.0f, 300.0f);

        assertEquals(90, atividadeFisica.getTempoTotalExecucao());
    }

    @Test
    void deveRetornarCaloriasGastas() {

        AtividadeFisica atividadeFisica = new Musculacao(90.0f, 300.0f);

        assertEquals(300, atividadeFisica.getCaloriasGastas());
    }

    @Test
    void deveRetornarNomeAtividade() {
        AtividadeFisica atividadeFisica = new Musculacao(90.0f, 300.0f);

        assertEquals("Musculação", atividadeFisica.getNomeAtividade());
    }

    @Test
    void deveRetornarTempoAtividadeComSpinning() {

        AtividadeFisica atividadeFisica = new AulaSpinning( new Musculacao(90.0f, 300.0f));

        assertEquals(140, atividadeFisica.getTempoTotalExecucao());
    }

    @Test
    void deveRetornarCaloriasGastasComSpinning() {

        AtividadeFisica atividadeFisica = new AulaSpinning( new Musculacao(90.0f, 300.0f));

        assertEquals(550, atividadeFisica.getCaloriasGastas());
    }

    @Test
    void deveRetornarNomeAtividadeComSpinning() {
        AtividadeFisica atividadeFisica = new AulaSpinning( new Musculacao(90.0f, 300.0f));

        assertEquals("Musculação Aula de Spinning", atividadeFisica.getNomeAtividade());
    }

    @Test
    void deveRetornarTempoAtividadeComDanca() {

        AtividadeFisica atividadeFisica = new AulaDanca( new Musculacao(90.0f, 300.0f));

        assertEquals(135, atividadeFisica.getTempoTotalExecucao());
    }

    @Test
    void deveRetornarCaloriasGastasComDanca() {

        AtividadeFisica atividadeFisica = new AulaDanca( new Musculacao(90.0f, 300.0f));

        assertEquals(500, atividadeFisica.getCaloriasGastas());
    }

    @Test
    void deveRetornarNomeAtividadeComDanca() {
        AtividadeFisica atividadeFisica = new AulaDanca( new Musculacao(90.0f, 300.0f));

        assertEquals("Musculação Aula de dança", atividadeFisica.getNomeAtividade());
    }

    @Test
    void deveRetornarTempoAtividadeComNatacao() {

        AtividadeFisica atividadeFisica = new Natacao( new Musculacao(90.0f, 300.0f));

        assertEquals(130, atividadeFisica.getTempoTotalExecucao());
    }

    @Test
    void deveRetornarCaloriasGastasComNatacao() {

        AtividadeFisica atividadeFisica = new Natacao( new Musculacao(90.0f, 300.0f));

        assertEquals(400, atividadeFisica.getCaloriasGastas());
    }

    @Test
    void deveRetornarNomeAtividadeComNatacao() {
        AtividadeFisica atividadeFisica = new Natacao( new Musculacao(90.0f, 300.0f));

        assertEquals("Musculação Aula de natação", atividadeFisica.getNomeAtividade());
    }

    @Test
    void deveRetornarTempoAtividadeComSpinningDanca() {

        AtividadeFisica atividadeFisica = new AulaDanca(new AulaSpinning( new Musculacao(90.0f, 300.0f)));

        assertEquals(185, atividadeFisica.getTempoTotalExecucao());
    }

    @Test
    void deveRetornarCaloriasGastasComSpinningDanca() {

        AtividadeFisica atividadeFisica = new AulaDanca(new AulaSpinning( new Musculacao(90.0f, 300.0f)));

        assertEquals(750, atividadeFisica.getCaloriasGastas());
    }

    @Test
    void deveRetornarNomeAtividadeComSpinningDanca() {
        AtividadeFisica atividadeFisica = new AulaDanca(new AulaSpinning( new Musculacao(90.0f, 300.0f)));

        assertEquals("Musculação Aula de Spinning Aula de dança", atividadeFisica.getNomeAtividade());
    }

    @Test
    void deveRetornarTempoAtividadeComSpinningNatacao() {

        AtividadeFisica atividadeFisica = new Natacao(new AulaSpinning( new Musculacao(90.0f, 300.0f)));

        assertEquals(180, atividadeFisica.getTempoTotalExecucao());
    }

    @Test
    void deveRetornarCaloriasGastasComSpinningNatacao() {

        AtividadeFisica atividadeFisica = new Natacao(new AulaSpinning( new Musculacao(90.0f, 300.0f)));

        assertEquals(650, atividadeFisica.getCaloriasGastas());
    }

    @Test
    void deveRetornarNomeAtividadeComSpinningNatacao() {
        AtividadeFisica atividadeFisica = new Natacao(new AulaSpinning( new Musculacao(90.0f, 300.0f)));

        assertEquals("Musculação Aula de Spinning Aula de natação", atividadeFisica.getNomeAtividade());
    }

    @Test
    void deveRetornarTempoAtividadeComDancaNatacao() {

        AtividadeFisica atividadeFisica = new Natacao(new AulaDanca( new Musculacao(90.0f, 300.0f)));

        assertEquals(175, atividadeFisica.getTempoTotalExecucao());
    }

    @Test
    void deveRetornarCaloriasGastasComDancaNatacao() {

        AtividadeFisica atividadeFisica = new Natacao(new AulaDanca( new Musculacao(90.0f, 300.0f)));

        assertEquals(600, atividadeFisica.getCaloriasGastas());
    }

    @Test
    void deveRetornarNomeAtividadeComDancaNatacao() {
        AtividadeFisica atividadeFisica = new Natacao(new AulaDanca( new Musculacao(90.0f, 300.0f)));

        assertEquals("Musculação Aula de dança Aula de natação", atividadeFisica.getNomeAtividade());
    }

    @Test
    void deveRetornarTempoAtividadeComSpinningDancaNatacao() {

        AtividadeFisica atividadeFisica = new Natacao(new AulaDanca(new AulaSpinning( new Musculacao(90.0f, 300.0f))));

        assertEquals(225, atividadeFisica.getTempoTotalExecucao());
    }

    @Test
    void deveRetornarCaloriasGastasComSpinningDancaNatacao() {

        AtividadeFisica atividadeFisica = new Natacao(new AulaDanca(new AulaSpinning( new Musculacao(90.0f, 300.0f))));

        assertEquals(850, atividadeFisica.getCaloriasGastas());
    }

    @Test
    void deveRetornarNomeAtividadeComSpinningDancaNatacao() {
        AtividadeFisica atividadeFisica = new Natacao(new AulaDanca(new AulaSpinning( new Musculacao(90.0f, 300.0f))));

        assertEquals("Musculação Aula de Spinning Aula de dança Aula de natação", atividadeFisica.getNomeAtividade());
    }
}