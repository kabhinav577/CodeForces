import java.util.Scanner;

public class UltraFastMathematic_61A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String result = "";
        for(int i = 0; i < s1.length(); i++)
        {
            if(s1.charAt(i) == s2.charAt(i))
              result += '0';
            else
               result += '1';   
        }
        System.out.println(result);


        ///// Error Create below code java.util.NoSuchElementException  //////
	/*
        at java.base/java.util.Scanner.throwFor(Scanner.java:937)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at UltraFastMathematic_61A.main(UltraFastMathematic_61A.java:12)
    */
        // int n = sc.nextInt();
        // int A[] = new int[n];
        // int B[] = new int[n];
        // for(int i = 0; i < n; i++)
        // {
        //     A[i] = sc.nextInt();
        // }
        // for(int i = 0; i < n; i++)
        // {
        //     B[i] = sc.nextInt();
        // }
        // for(int i = 0; i < n; i++)
        // {
        //     System.out.print(A[i] ^ B[i]);
        // }
        sc.close();
    }
}
