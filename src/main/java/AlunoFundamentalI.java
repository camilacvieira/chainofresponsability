public class AlunoFundamentalI extends Aluno {

    public AlunoFundamentalI(Aluno fundamentali) {
        listaAvaliacao.add(TipoAvaliacaoTeste.getTipoAvaliacaoTeste());
        setAlunoSuperior(fundamentali);
    }

    public String getDescricaoFormacao() {
        return "Fundamental I";
    }
}
