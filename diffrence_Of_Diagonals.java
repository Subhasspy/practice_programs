import java.util.*;

public class diffrence_Of_Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),left=0,right=0;
        int ar[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
            ar[i][j]=sc.nextInt();
            if(i==j)
            left+=ar[i][j];
            if(j==n-i-1)
            right+=ar[i][j];
          }
        }
        System.out.println(Math.abs(left-right));
    }
}