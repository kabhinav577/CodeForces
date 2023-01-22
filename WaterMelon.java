import java.util.*;

public class WaterMelon {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if(n==2)
    	   System.out.println("No");
       else if(n % 2 == 0)
       System.out.println("Yes");
       else
    	   System.out.println("No");
       sc.close();
       
	}

}
