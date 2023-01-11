import java.util.Scanner;

public class TooLongWord_71A {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] S = new String[n];
        
        for(int i = 0; i < n; i++)
        {
            S[i] = sc.next();
        }
        for(int i =0; i < n;i++)
        {
            int l = S[i].length();
            if(l < 11)
            System.out.println(S[i]);
            else
            {
                char ch1 = S[i].charAt(0);
                char ch2 = S[i].charAt(l-1);
                System.out.print(ch1);
                System.out.print(l-2);
                System.out.println(ch2);
            }
        }
        sc.close();

    }
}