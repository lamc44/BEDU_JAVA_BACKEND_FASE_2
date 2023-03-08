public class TextEditor {
    private Command saveCommand;

    public TextEditor() {
        saveCommand = new SaveCommand();
    }

    /*
        Guarda el archivo cuando el usuario presiona el boton guardar
     */

    public void onPressSaveButton() {
        System.out.println("[SAVE BUTTON]");
        saveCommand.execute();
    }

    /*
        Guarda el archivo cuando el usuario presiona en el menu "GUARDAR ARCHIVO"
     */

    public void onMenuSaveOption() {
        System.out.println("[MENU]");
        saveCommand.execute();
    }

    /*
        Guarda el archivo cuando el usuario presiona la combinacion en el teclado
     */

    public void onShortcut() {
        System.out.println("[SHORTCUT]");
        saveCommand.execute();
    }
}