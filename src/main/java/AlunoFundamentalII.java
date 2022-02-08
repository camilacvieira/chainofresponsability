public class AlunoFundamentalII extends Aluno {

    public AlunoFundamentalII(Aluno fundamentalii) {
        listaAvaliacao.add(TipoAvaliacaoProva.getTipoAvaliacaoProva());
        setAlunoSuperior(fundamentalii);
    }

    public String getDescricaoFormacao() {
        return "Fundamental II";
    }
}
