public class TipoAvaliacaoTeste implements TipoAvaliacao {

    private static TipoAvaliacaoTeste tipoAvaliacaoTeste = new TipoAvaliacaoTeste();

    private TipoAvaliacaoTeste() {};

    public static TipoAvaliacaoTeste getTipoAvaliacaoTeste() {
        return tipoAvaliacaoTeste;
    }
}
