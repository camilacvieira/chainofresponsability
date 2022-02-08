public class TipoAvaliacaoTrabalho implements TipoAvaliacao {

    private static TipoAvaliacaoTrabalho tipoAvaliacaoTrabalho = new TipoAvaliacaoTrabalho();

    private TipoAvaliacaoTrabalho() {};

    public static TipoAvaliacaoTrabalho getTipoAvaliacaoTrabalho() {
        return tipoAvaliacaoTrabalho;
    }
}
