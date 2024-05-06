import java.util.Scanner;

public class JPA502_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String myString=sc.nextLine();
        int L=myString.length();
        char[] myChar=new char[L];
        int[] Num_arr=new int[L];

        for(int i=0;i<L;i++){
            myChar[i]=myString.charAt(i);       //將myString 字串的每個字元存入myChar[]
        }

        for(int j=0;j<L;j++){
            int num=myChar[j]-'0';    //利用ASCII, 將 myChar[j] 的字元轉成數字
            Num_arr[j]=num;
        }
        int total=1;
        for(int k=0;k<L;k++){               //輸出每一個數字相乘的算式及結果
            total *= Num_arr[k];
            System.out.print(Num_arr[k]);
            if(k<L-1) System.out.print("*");

        }
        System.out.print("="+total);
        sc.close();
    }
}
