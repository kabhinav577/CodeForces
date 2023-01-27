import java.util.Scanner;

// Input
// The first line contains a non-empty string, that contains only lowercase English letters — the user name. This string contains at most 100 letters.

// Output
// If it is a female by our hero's method, print "CHAT WITH HER!" (without the quotes), otherwise, print "IGNORE HIM!" (without the quotes).

public class BoyOrGirl_236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int duplicateCount = 0;
        for(int i = 0; i < str.length()-1; i++)
        {
            for(int j = i+1; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j)) {
                  duplicateCount++;
                  break;
                }  
            }
        }
        int check = str.length() - duplicateCount;
        if(check % 2 == 0 ) 
           System.out.println("CHAT WITH HER!");
        else
           System.out.println("IGNORE HIM!");   
        
        sc.close();
    }
}