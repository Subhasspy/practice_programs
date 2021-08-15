public class Zeckendorf
{
	public static void main(String[] args) {
		int n = 30,f2=0;
        System.out.println("Non-neighbouring Fibonacci "
                           + " Representation of " + n + " is");
         while (n > 0) {
            if (n == 0 || n == 1)
            f2=1;
            else{
                int f1 = 0, f3 = 1; 
                f2 = 1;
                while (f3 <= n) {
                    f1 = f2;
                    f2 = f3;
                    f3 = f1 + f2;
                }
            }
            System.out.print(f2 + " ");
            n = n - f2;
        }
	}
}