import java.util.*;

public class DislikeOfThrees_1560A {
    public static int polycarpLikes(int k) {
        int count = 0;
        int num = 1;

        while(true) {
            if(num % 3 != 0 && num % 10 != 3) { // Here i'm checking num is not Divisble by 3 or end with the digit 3
                count++;
                if(count == k) {
                    return num;
                }
            }
            num++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int k = sc.nextInt();
            int result = polycarpLikes(k);
            System.out.println(result);
        }
    }
}