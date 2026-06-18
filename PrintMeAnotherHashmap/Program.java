
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printValues(HashMap<String, Book> hashMap) {
        for (Book books : hashMap.values()) {
            System.out.println(books.toString());
        }
    }
    
    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text) {
        text = sanitizedString(text);
        for (Book books : hashMap.values()) {
            if (books.getName().contains(text)) {
                System.out.println(books.toString());
            }
        }
    }
    
    public static String sanitizedString(String text) {
        return text.toLowerCase().trim();
    }
}

