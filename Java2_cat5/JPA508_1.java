import java.util.Scanner;

public class JPA508_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String myString1=sc.nextLine();         //輸入8位元的二進位字串
        String mString2=sc.nextLine();          //輸入8位元的二進位字串
        int L1=myString1.length();
        int L2=mString2.length();

        char[] myChar1=new char[L1];
        char[] myChar2=new char[L2];
/*****************************************************************/      
        //將myString 字串的每個字元存入myChar1[], myChar2[]
        for(int i=0;i<L1;i++) myChar1[i]=myString1.charAt(i);
        for(int i=0;i<L2;i++) myChar2[i]=mString2.charAt(i);

        //利用ASCII, 將 myChar[j] 的字元轉成數字
        int[] myInt1=new int[L1];        //使用陣列存放每個二進位數
        int[] myInt2=new int[L2];
        for(int j=0;j<L1;j++) {
            int num=myChar1[j]-'0';
            myInt1[j]=num;
        }
        for(int j=0;j<L2;j++){
            int num=myChar2[j]-'0';
            myInt2[j]=num;
        }
/*****************************************************************/
        int n1=0, n2=0;
        for(int i=0;i<L1;i++){
            n1+=myInt1[i]*(int)(Math.pow(2,(7-i))) ;  //二進位轉十進位
        }
        for(int i=0;i<L2;i++){
            n2+=myInt2[i]*(int)(Math.pow(2,(7-i)));     //二進位轉十進位
        }

        System.out.println(n1+" + "+n2+" = "+(n1+n2));  // 兩個十進位加總
        if((n1+n2)>255) System.out.println("11111111");
        else   System.out.println(Integer.toBinaryString(n1+n2));

        sc.close();
    }
}
