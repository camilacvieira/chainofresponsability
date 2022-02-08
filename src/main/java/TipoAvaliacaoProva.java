public class TipoAvaliacaoProva implements TipoAvaliacao {

    private static TipoAvaliacaoProva tipoAvaliacaoProva = new TipoAvaliacaoProva();

    private TipoAvaliacaoProva() {};

    public static TipoAvaliacaoProva getTipoAvaliacaoProva() {
        return tipoAvaliacaoProva;
    }
}
