public class Application {
    public static void main(String[] args) {
        Helado heladoSuave = new HeladoSuave();

        heladoSuave = new CoberturaDecorador(heladoSuave);
        heladoSuave = new GranolaDecorador(heladoSuave);
        heladoSuave = new ToppingDecorador(heladoSuave);
        heladoSuave = new MermeladaDecorador(heladoSuave);
        heladoSuave = new GalletaDecorador(heladoSuave);

        System.out.println("[Ticket de compra]");
        System.out.println(heladoSuave.descripcion());
        System.out.println("$" + heladoSuave.costo());
    }
}