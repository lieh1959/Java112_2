import java.util.Scanner;

public class JPA202_1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int k=input.nextInt();  //k為 使用者輸入分數
        if(k>100 ||k<0) System.out.println("error");
        else{
            if(k>60) {
                k+=10;
                System.out.println(k);
            }
            else {
                k+=5;
                System.out.println(k);
            }
        }
        input.close();
    }
}
