import java.util.Scanner;

public class JPA306_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println(k+"!="+compute(k));
        sc.close();
    }

    public static int compute(int n){
        if (n==0) return 1;
        else return n*compute(n-1);     //use recursion
    }
}
