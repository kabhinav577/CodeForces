import java.util.Scanner;

public class SoldierAndBanana_546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dollar = sc.nextInt();
        int totalDollar = sc.nextInt();
        int banana = sc.nextInt();
        int totalPayDollar = 0;
        for(int i = 1; i <= banana ; i++ )
        {
            totalPayDollar += (dollar * i);
        }
        if(totalPayDollar > totalDollar)
        {
            int borrowDollar = totalPayDollar - totalDollar;
            System.out.println(borrowDollar);
        }
        else
           System.out.println(0);
        
        sc.close();
    }
}