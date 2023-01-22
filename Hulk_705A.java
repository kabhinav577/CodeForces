import java.util.*;

public class Hulk_705A {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        String oddFeeling = "I hate ";
        String evenFeeling = "I love ";
        String midWord = "that ";
        String endWord = "it";

        String result = "";
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0) {
                result += evenFeeling;
            } else {
                result += oddFeeling;
            }

            if(i == n) {
                result += endWord;
            } else {
                result += midWord;
            }
        }
        // result = result.trim();

        System.out.println(result);

        sc.close();
    }
}