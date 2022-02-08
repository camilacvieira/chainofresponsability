public class TipoAvaliacaoSimulado implements TipoAvaliacao {

    private static TipoAvaliacaoSimulado tipoAvaliacaoSimulado = new TipoAvaliacaoSimulado();

    private TipoAvaliacaoSimulado() {};

    public static TipoAvaliacaoSimulado getTipoAvaliacaoSimulado() {
        return tipoAvaliacaoSimulado;
    }
}
