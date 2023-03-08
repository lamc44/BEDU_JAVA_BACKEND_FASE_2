public class ToppingDecorador extends ExtrasDecorador {// implements Helado {
    private Helado helado;

    public ToppingDecorador(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String descripcion() {
        return helado.descripcion() + ", con toppings";
    }

    @Override
    public int costo() {
        return helado.costo() + 20;
    }
}