// ip:
// 2
// hi
// world
// hwllo
// world
// op:
// No
// Yes
// first it take a pair of words and the it compare if the substring of first word is present in next it repeat for all the pair pressent in it and return "Yes" if it has or return "No"
import java.util.*;
public class Substring_present_or_not
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n*2];
		for(int i=0;i<n*2;i++)
		{
		    s[i]=sc.next();
		}
		
		for(int i=0;i<n*2;i+=2)
		{
		    int flag=0;
		    for(int j=0;j<s[i].length();j++)//hi
		    {
		        for(int k=0;k<s[i+1].length();k++)//world
		        {
		            if(s[i].charAt(j)==s[i+1].charAt(k))
		            {
		                flag++;
		            }
		        }
		    }
		    System.out.println(flag==0?"No":"Yes");
		}
	}
}