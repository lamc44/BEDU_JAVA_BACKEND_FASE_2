public class Application {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // El usuario presiona el boton de guardar
        editor.onPressSaveButton();

        // El usuario presiona la opcion de guardar en el menu
        editor.onMenuSaveOption();

        // El usuario presiona la combinacion en el teclado
        editor.onShortcut();
    }
}