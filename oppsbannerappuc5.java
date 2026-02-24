public class oppsbannerappuc5 {
    public static void main(String[] args) {
        
        String symbol = "*";
        int length = 20;

        String[] banner = {
            String.join("", java.util.Collections.nCopies(length, symbol)), 
            "* HELLO WORLD    *",                                     
            "* JAVA        *",                                      
            "* OPTIMIZED     *",                                    
            "* UC5         *",                                       
            "* READABILITY    *",                                     
            String.join("", java.util.Collections.nCopies(length, symbol))  
        };

        
        for (String line : banner) {
            System.out.println(line);
        }
    }
}