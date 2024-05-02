import java.util.*;
public class JPA208_1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int no=scn.nextInt();  //input a number

        int count;          //計算no 可以被小於它的數字整除的數目
        for (int i=2;i<no;i++){          // isPrime ?  判別質數
            count=0;
            for(int j=2;j<=i;j++){
                
                if(i%j==0){
                count++;

                }
            }
            if(count==1) System.out.print(i+" ");
        }
       scn.close();
    }
}
