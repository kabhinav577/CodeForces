import java.util.ArrayList;
import java.util.Scanner;

public class GeorgeAndAlex_467A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> person = new ArrayList<>();
        ArrayList<Integer> roomCap = new ArrayList<>();
        for(int i = 0; i < n; i++) {
          person.add(i, sc.nextInt());
          roomCap.add(i, sc.nextInt());
        }

        int count= 0;  
        for(int i = 0; i < n; i++) {
            if(person.get(i) + 1 < roomCap.get(i))
              count++;
        }
        System.out.println(count);
        sc.close();
    }
}