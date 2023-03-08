public class MermeladaDecorador extends ExtrasDecorador {//implements Helado {
    private final Helado helado;

    public MermeladaDecorador(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String descripcion() {
        return helado.descripcion() + ", con mermelada";
    }

    @Override
    public int costo() {
        return helado.costo() + 10;
    }
}