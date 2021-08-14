import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[]=new int[4];
		String car[]=new String[4];
		int i=0,j=0;
		StringTokenizer st = new StringTokenizer("m 66 i 104"," ");  
        while (st.hasMoreTokens()) {  
            String temp=st.nextToken();
            try{
                int no=Integer.parseInt(temp);
                num[i++]=no;
            }
            catch(NumberFormatException e)
            {
                car[j++]=temp;
            }
            //i++;
        }  
        for(int k=0;k<2;k++)
        {
            if(num[k]!=0)
            System.out.println((char)num[k]);
            if(!car[k].equals(null))
            System.out.println((int)car[k].charAt(0));
        }
	}
}
