//Repeted String
import java.util.*;
public class Repeted_String
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c=sc.nextLine().toCharArray();
		int n=c.length;
		for(int i=0;i<n;i++)
		{
		    int count=0;
		    for(int j=i+1;j<n;j++)
		    {
		        if(c[i]==c[j])
		        {
		            count++;
		        }
		    }
		    if(count>=1)
		    System.out.println(c[i]+":"+count++);
		}
	}
}
