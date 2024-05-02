import java.util.Scanner;

public class JPA302_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println(compute(k));
        sc.close();
    }

    public static int compute (int score){
        if(score<0||score>100) return -1;
        else{
            if(score>=60) return score+=5;
            else return score+=10;
        }
       
    } 
    
}
