public class Main {

    public static void main(String[] args) {
        // Test your program here!
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "example");
        abbreviations.addAbbreviation("etc", "etcetera");
        abbreviations.addAbbreviation("gtg", "Got To Go");
        
        System.out.println(abbreviations.findExplanationFor("etc")  
                + "\n" + abbreviations.hasAbbreviation("eod"));   
    }
}

