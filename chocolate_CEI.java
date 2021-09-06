// Little Bob loves chocolate, and he goes to a store with ₹N in his pocket. The price of each chocolate is ₹C. The store offers a discount: for every M wrapper he gives to the store, he gets one chocolate for free. How many chocolates does Bob get to eat? Input Format:Three integers, N, C, and M. Output Format:Print the total number of chocolates Bob eats. 
import java.util.*;

public class chocolate_CEI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),c=sc.nextInt(),m=sc.nextInt();
        int choco=n/c;
        int toco=choco/m;
        int leftOut=choco%m+toco;
        if(leftOut>=m)
        {
            System.out.println(toco+choco+(leftOut/m));
        }
        else
        System.out.println(toco+choco);
        sc.close();
    }
}