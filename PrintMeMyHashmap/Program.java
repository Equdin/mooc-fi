
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!        
        HashMap<String, String> hashMap = new HashMap<>();
        
        hashMap.put("username", "Mr. Wilson");
        hashMap.put("email", "wilson@email.com");
        hashMap.put("management", "HR");
        
        printKeys(hashMap);
        System.out.println();
        printKeysWhere(hashMap, "em");
        System.out.println("");
        printValuesOfKeysWhere(hashMap, "na");
    }
    
    public static void printKeys(HashMap<String, String> hashMap) {
        printKeysWhere(hashMap, "");
    }
    
    public static void printKeysWhere(HashMap<String, String> hashMap, String text) {
        for (String keys : hashMap.keySet()) {
            if (keys.contains(text)) {
                System.out.println(keys);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text) {
        for (String keys : hashMap.keySet()) {
            if (keys.contains(text)) {
                System.out.println(hashMap.get(keys));
            }
        }
        
    }
}
