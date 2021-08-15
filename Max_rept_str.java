import java.util.*;
public class Max_rept_str
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine(),temp=" ";
		String[] sArr=s.split(" ");
		int n=sArr.length,max=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(sArr[i].equals(sArr[j]) && !sArr[i].equals("*"))
		        {
		            int t=sArr[i].length();
		            sArr[j]="*";
		            if(max<t)
		            {
		                max=t;
		                temp=sArr[i];
		            }
		        }
		    }
		}
		System.out.println(temp);
	}
}