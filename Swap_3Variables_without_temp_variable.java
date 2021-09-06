public class Swap_3Variables_without_temp_variable   
{  
    public static void main(String[] args)   
    {  
        int a = 10,b = 20,c = 30;
        System.out.println("Before swapping a = " + a +", b = " + b + ",c = " + c);
        a = a ^ b ^ c;
        b = a ^ b ^ c;
        c = a ^ b ^ c;
        a = a ^ b ^ c;
        System.out.println("After swapping a = " + a +", b = " + b + ", c = " + c);  
    }  
    
}  