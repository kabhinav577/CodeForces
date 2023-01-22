import java.util.Scanner;

public class Translation_41A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String result = "";

        for(int i = str2.length() - 1; i >= 0; i--)
           result += str2.charAt(i);
        
        if(str1.equals(result))
          System.out.println("YES");
        else
        System.out.println("NO");
        
        sc.close();
    }
}
