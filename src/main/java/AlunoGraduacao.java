public class AlunoGraduacao extends Aluno {

    public AlunoGraduacao(Aluno graduacao) {
        listaAvaliacao.add(TipoAvaliacaoTrabalho.getTipoAvaliacaoTrabalho());
        setAlunoSuperior(graduacao);
    }

    public String getDescricaoFormacao() {
        return "Graduacao";
    }
}
