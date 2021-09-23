//Add_numbers_in_String
import java.util.*;
public class Add_numbers_in_String
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String []s=sc.nextLine().split(" ");
		int sum=0;
		for(int i=0;i<s.length;i++)
		{
		    if(s[i].charAt(0)=='-')
		    sum-=Integer.parseInt(s[i].substring(1));
		    else
		    sum+=Integer.parseInt(s[i]);
		}
		System.out.println(sum);
	}
}