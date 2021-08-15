import java.util.*;
public class encode_in_ascii
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []s=sc.nextLine().split(" ");
		int n=s.length,j=0,k=0;
		int[] num=new int[n];
		String[] car=new String[n];
		for(int i=0;i<n;i++)
		{
		    try {
		        int no=Integer.parseInt(s[i]);
		        num[j++]=no;
		    } 
		    catch(Exception e) {
		        car[k++]=s[i];
		    } 
		}
		for(int number=0;number<j;number++)
		{
		    char c=(char)num[number];
		    System.out.print(c+" ");
		}
		for(int str=0;str<k;str++)
		{
		    int b=(int)car[str].charAt(0);
		    System.out.print(b+" ");
		}
	}
}

