import java.util.Scanner;

public class WordCapitalization_281A {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);

        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
            
        sc.close();
    }
}
