/**
 *
 * @author kiran
 */
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbrs;
    
    public Abbreviations () {
        this.abbrs = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        String abbr = sanitizedString(abbreviation);
        String expl = sanitizedString(explanation);
        
        if (!this.hasAbbreviation(abbr)) {
            this.abbrs.put(abbr, expl);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        String abbr = sanitizedString(abbreviation);
        return abbrs.containsKey(abbr);
    }
    
    public String findExplanationFor(String abbreviation) {
        String abbr = sanitizedString(abbreviation);
        
        if (this.hasAbbreviation(abbr)) {
            return this.abbrs.get(abbr);
        }
        
        return null;
    }
    
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
        
        string = string.toLowerCase();
        return string.trim();
    }
}

