//input:
// bbbptank
//output:
// baknp
//Exp:when we give a string it will print the 5 letter string starts form high repeat to low after that print remaining non repeating char as alphabetical order
import java.util.*;
public class zoho1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s=sc.nextLine().toCharArray();
		int[] num=new int[s.length];
		char[] c=new char[s.length];
		int l =0,t=5;
		for(int i=0;i<s.length;i++)
		{
		    int count=0;
		    for(int j=i+1;j<s.length;j++)
		    {
		        if(s[i]==s[j] && s[i]!='*')
		        {
		            s[j]='*';
		            count++;
		        }
		    }
		    if(s[i]!='*' && s[i]!=' ')
		    {
		        num[l]=count;
		        c[l]=s[i];
		        s[i]='*';
		        l++;
		    }
		}
		for(int i=0;i<l;i++)
		{
		    for(int j=0;j<l;j++)
		    {
		        if(num[i]>num[j])
		        {
		            int nt=num[i];
		            char ct=c[i];
		            num[i]=num[j];
		            c[i]=c[j];
		            num[j]=nt;
		            c[j]=ct;
		        }
		        else if(num[i]==num[j] && c[i]<c[j])
		        {
		            char ct=c[i];
		            c[i]=c[j];
		            c[j]=ct;
		        }
		    }
		}
		if(l>5)
		{
    		for(int i=0;i<l;i++)
    		{
    		    if(num[i]!=0 && t>0)
    		    {
    		        System.out.print(c[i]);
    		        t--;
    		    }
    		}
    		int k=0;
    		while(t>0 && k<l)
    		{
    		    if(num[k]==0)
    		    {
    		        System.out.print(c[k]);
    		        
    		        t--;
    		    }
    		    k++;
    		}
		}
		else
		{
		    for(int j=0;j<l;j++)
		    {
		        System.out.print(c[j]);
		    }
		}
		sc.close();
	}
}
