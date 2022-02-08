import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliacaoTest {

    AlunoFundamentalI fundamentali;
    AlunoFundamentalII fundamentalii;
    AlunoEnsinoMedio ensinoMedio;
    AlunoGraduacao graduacao;

    @BeforeEach
    void setUp() {
        fundamentali = new AlunoFundamentalI(null);
        fundamentalii = new AlunoFundamentalII(fundamentali);
        ensinoMedio = new AlunoEnsinoMedio(fundamentalii);
        graduacao = new AlunoGraduacao(ensinoMedio);
    }

    @Test
    void deveRetornarGradParaAssinaturaTrabalho() {
        assertEquals("Graduacao", graduacao.assinarAvaliacao(new Avaliacao(TipoAvaliacaoTrabalho.getTipoAvaliacaoTrabalho())));
    }

    @Test
    void deveRetornarEMParaAssinaturaSimulado() {
        assertEquals("Ensino Medio", graduacao.assinarAvaliacao(new Avaliacao(TipoAvaliacaoSimulado.getTipoAvaliacaoSimulado())));
    }

    @Test
    void deveRetornarFiiParaAssinaturaProva() {
        assertEquals("Fundamental II", graduacao.assinarAvaliacao(new Avaliacao(TipoAvaliacaoProva.getTipoAvaliacaoProva())));
    }

    @Test
    void deveRetornarFiParaAssinaturaTeste() {
        assertEquals("Fundamental I", graduacao.assinarAvaliacao(new Avaliacao(TipoAvaliacaoTeste.getTipoAvaliacaoTeste())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaBoletim() {
        assertEquals("Sem assinatura", graduacao.assinarAvaliacao(new Avaliacao(TipoBoletim.getTipoBoletim())));
    }

}