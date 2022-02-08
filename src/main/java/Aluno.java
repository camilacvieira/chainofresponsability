import java.util.ArrayList;

public abstract class Aluno {

    protected ArrayList listaAvaliacao = new ArrayList();
    private Aluno alunoSuperior;

    public Aluno getAlunoSuperior() {
        return alunoSuperior;
    }

    public void setAlunoSuperior(Aluno alunoSuperior) {
        this.alunoSuperior = alunoSuperior;
    }

    public abstract String getDescricaoFormacao();

    public String assinarAvaliacao(Avaliacao avaliacao) {
        if (listaAvaliacao.contains(avaliacao.getTipoAvaliacao())) {
            return getDescricaoFormacao();
        }
        else {
            if (alunoSuperior != null) {
                return alunoSuperior.assinarAvaliacao(avaliacao);
            }
            else
            {
                return "Sem assinatura";
            }
        }
    }
}
