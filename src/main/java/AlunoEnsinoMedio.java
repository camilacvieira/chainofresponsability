public class AlunoEnsinoMedio extends Aluno {

    public AlunoEnsinoMedio(Aluno ensinoMedio) {
        listaAvaliacao.add(TipoAvaliacaoSimulado.getTipoAvaliacaoSimulado());
        setAlunoSuperior(ensinoMedio);
    }

    public String getDescricaoFormacao() {
        return "Ensino Medio";
    }
}
