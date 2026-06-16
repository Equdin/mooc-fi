
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                first.add(amount);
            }
            if (command.equals("move")) {
                int temp = first.contains();
                first.remove(amount);
                if (first.contains() == 0) {
                    second.add(temp);
                    continue;
                }
                
                second.add(amount);
            }
            if (command.equals("remove")) {
                second.remove(amount);
            }

        }
    }

}

