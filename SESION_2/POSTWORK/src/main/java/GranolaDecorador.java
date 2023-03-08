public class GranolaDecorador extends ExtrasDecorador {//implements Helado {
    private final Helado helado;

    public GranolaDecorador(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String descripcion() {
        return helado.descripcion() + ", con Granola";
    }

    @Override
    public int costo() {
        return helado.costo() + 10;
    }
}