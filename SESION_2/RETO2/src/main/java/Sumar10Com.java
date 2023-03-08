public class Sumar10Com implements Command {
    public int execute(int counter) {
        return counter + 10;
    }

    public int unexecute(int counter) {
        return counter - 10;
    }
}