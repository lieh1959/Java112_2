import java.util.*;
public class JPA206_1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int sum=0;
      
        while(a<=b){
        if (a%2!=0)  sum+=a;    // odd or even ?
        a++;
                   
        }
        System.out.println(sum);
        
        scn.close();
    }
}
