import java.util.Scanner;

public class MishkaGame_703A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mishkaWin = 0;
        int chrisWin = 0;
        for(int i = 0; i < n; i++){
            int mishka = sc.nextInt();
            int chris = sc.nextInt();
            if(mishka > chris)
                mishkaWin++;
            else if( mishka < chris)
                chrisWin++;
        }
        if(mishkaWin > chrisWin)
            System.out.println("Mishka");
        else if(mishkaWin < chrisWin)
            System.out.println("Chris");
        else 
            System.out.println("Friendship is magic!^^");
        sc.close();
    }
}
