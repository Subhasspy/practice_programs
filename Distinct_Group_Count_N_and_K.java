// Given a number of people N and a number of groups K, find the distinct ways W to form K contiguous groups out of the N people while meeting the following conditions.
// - In each option, the total of group sizes is equal to the number of people.
// - In each option, each groups size must be greater than or equal to the group to its left.
// - The groups formed in each option are distinct, meaning that they differ in at least one group. For example, (1,1,1,3) is distinct from (1,1,1,2) but not from (1,3,1,1).

// Boundary Condition(s):
// 1 <= N <= 100
// Input Format:
// The first line contains the values of N and K separated by a space.
// Output Format:
// The first line contains the value of the distinct options W.

// Example Input/Output 1:
// Input:
// 5 3
// Output:
// 2
// Explanation:
// The possibilities are (1,1,3) (1,2,2).

// Example Input/Output 2:
// Input:
// 8 4
// Output:
// 5
// Explanation:
// The possibilities are (1,1,1,5) (2,2,2,2) (1,1,2,4) (1,2,2,3) (1,1,3,3).


import java.util.*;
public class Distinct_Group_Count_N_and_K {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		if(k>n && k==0)
		{
		    System.out.println(0);
		    return;
		}
		int way[][]=new int[n+1][k+1];
		for(int people=1;people<=n;people++)
		{
		    way[people][1]=1;
		}
		for(int people=2;people<=n;people++)
		{
		    for(int group=2;group<=k;group++)
		    {
		        if(group>people)break;
		        way[people][group]=way[people-1][group-1]+way[people-group][group];
		    }
		}
		System.out.println(way[n][k]);
		sc.close();
	}
}