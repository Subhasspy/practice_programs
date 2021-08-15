//Removel of Repeted String
import java.util.*;
public class Removel_of_Repeted_String
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c=sc.nextLine().toCharArray();
		int n=c.length,k=0;
		char[] dup=new char[n];
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(c[i]==c[j] && c[i]!='*')
		        {
		            c[j]='*';
		        }
		    }
		    if(c[i]!='*')
		    dup[k++]=c[i];
		}
		for(char d:dup)
		{
		    System.out.print(d);
		}
	}
}