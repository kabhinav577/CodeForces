import java.util.ArrayList;
import java.util.Scanner;

public class InSearchOfEasyProblem_1030A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(i, sc.nextInt());
        }

        int oneNumberCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 1) {
                oneNumberCount++;
                break;
            }
        }
        if (oneNumberCount > 0)
            System.out.println("HARD");
        else
            System.out.println("EASY");

        sc.close();
    }
}