public class GalletaDecorador extends ExtrasDecorador {//implements Helado {
    private final Helado helado;

    public GalletaDecorador(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String descripcion() {
        return helado.descripcion() + ", con Galleta";
    }

    @Override
    public int costo() {
        return helado.costo() + 15;
    }
}