/**
 *
 * @author kiran
 */
import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
     
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            System.out.print("To add: ");
            String task = scanner.nextLine();
            list.add(task);
        } else if (command.equals("list")) {
            list.print();
        } else if (command.equals("remove")) {
            System.out.print("Which one is remove? ");
            int number = Integer.valueOf(scanner.nextLine());
            list.remove(number);
        }
    }
}

