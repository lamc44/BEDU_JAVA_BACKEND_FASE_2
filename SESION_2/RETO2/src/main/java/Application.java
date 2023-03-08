import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista para guaradar los comandos utilizados

        Stack<Command> stack = new Stack<>();

        // Creando las instancias de los diferentes comandos

        Command sumar10Com = new Sumar10Com();
        Command multPor2Com = new MultPor2Com();
        Command incrementar1Com = new Incrementar1Com();

        int counter = 0;

        int option = 0;

        while(option != 5) {
            System.out.println("\nValor actual: " + counter);
            System.out.println("Elige alguna opcion");
            System.out.println("1. Incrementa en uno el contador");
            System.out.println("2. Multiplica por dos el contador");
            System.out.println("3. Añade 10 al contador");
            System.out.println("4. Deshacer ultimo cambio");
            System.out.println("5. Salir");

            option = sc.nextInt();

            switch(option) {
                case 1:
                    counter = incrementar1Com.execute(counter);
                    stack.add(incrementar1Com);
                    break;
                case 2:
                    counter = multPor2Com.execute(counter);
                    stack.add(multPor2Com);
                    break;
                case 3:
                    counter = sumar10Com.execute(counter);
                    stack.add(sumar10Com);
                    break;
                case 4:
                    try {
                        Command undo = stack.pop();
                        if(undo != null) {
                            counter = undo.unexecute(counter);
                        }
                    } catch(EmptyStackException e) {
                        System.out.println("La lista de operaciones realizadas esta vacia");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Incorrecto, por favor digite el numero de la operacion a realizar");
                    break;
            }
        }
    }
}