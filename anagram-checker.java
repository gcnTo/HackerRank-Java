import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        String currentString = "";
        int aCount = 0;
        int bCount = 0;
        
        if(a.length() != b.length()){
            return false;
        }
        
        int condition = b.indexOf(a.charAt(0));
        
        while(a.length()>0){
            if(condition == -1){
                return false;
            } else {
                currentString = String.valueOf(a.charAt(0));
                
                aCount = a.length() - a.replace(currentString,"").length();
                bCount = b.length() - b.replace(currentString,"").length();
                
                if(aCount != bCount){
                    return false;
                }
                
                a = a.replace(currentString,"");
                b = b.replace(currentString,"");
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
