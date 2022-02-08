
public class TipoBoletim implements TipoAvaliacao {

    private static TipoBoletim tipoBoletim = new TipoBoletim();

    private TipoBoletim() {};

    public static TipoBoletim getTipoBoletim() {
        return tipoBoletim;
    }
}
