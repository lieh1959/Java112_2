import java.util.Scanner;

public class JPA308_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
       
        // 輸出 fib(k), fib(k-1),fib(k-2),...fib(0)
        for( int i=k;i>=1;i--){
            System.out.println("fib("+i+")="+compute(i));  // call recursion function 
        }
        sc.close();
    }

    public static int compute(int  n){
        if (n>=2 ) return (compute(n-1) + compute(n-2));
        else return n;
    }
}
