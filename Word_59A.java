import java.util.Scanner;

public class Word_59A {
    

    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in);

       String str = sc.next();
       int lCase = 0, uCase = 0;
       for(int i =0; i < str.length(); i++)
       {
         if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
           lCase++;
         else
           uCase++;  
       }
  
       if(lCase >= uCase)
        System.out.println(str.toLowerCase());
       else if(lCase < uCase)
        System.out.println(str.toUpperCase()); 
       
       sc.close(); 
    }
}
