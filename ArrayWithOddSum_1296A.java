import java.util.Scanner;

public class ArrayWithOddSum_1296A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int sum, odd , even;
        for (int i = 0; i < testCase; i++) {
            int n = sc.nextInt();
            sum = odd = even = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                if(arr[j] % 2 != 0 || arr[j] == 1) {
                    odd++;
                } else {
                    even++;
                }
                sum+=arr[j];
            }

            if(sum %2 != 0 || sum == 1) {
                System.out.println("YES");
            } else {
                if(odd != 0 && even != 0) {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}