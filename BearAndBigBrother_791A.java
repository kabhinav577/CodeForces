import java.util.Scanner;

public class BearAndBigBrother_791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limakAge = sc.nextInt();
        int bobAge = sc.nextInt();
        int incrementLimakAge = 1;
        int incrementBobAge = 1;
        incrementLimakAge = limakAge * 3;
        incrementBobAge = bobAge * 2;
        int yearCount = 1;
        while(incrementLimakAge <= incrementBobAge)
        {
            incrementLimakAge *= 3;
            incrementBobAge *= 2;
            yearCount++;
        }
        System.out.println(yearCount);
        sc.close();
    }
}
