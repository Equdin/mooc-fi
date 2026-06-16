
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        String[] parts = new String[2];

        first.print("First", first.getAmount());
        second.print("Second", second.getAmount());
        
        while (true) {

            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
                first.print("First", first.getAmount());
                second.print("Second", second.getAmount());
            } else if (command.equals("move")) {
                second.add(first.remove(amount));
                first.print("First", first.getAmount());
                second.print("Second", second.getAmount());
            } else if (command.equals("remove")) {
                second.remove(amount);
                first.print("First", first.getAmount());
                second.print("Second", second.getAmount());
            }
        }
    }
}

