public class CoberturaDecorador extends ExtrasDecorador {//implements Helado {
    private final Helado helado;

    public CoberturaDecorador(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String descripcion() {

        return helado.descripcion() + ", con Cobertura";
    }

    @Override
    public int costo() {
        return helado.costo() + 20;
    }
}