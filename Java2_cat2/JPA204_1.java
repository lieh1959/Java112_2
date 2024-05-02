import java.util.Scanner;

public class JPA204_1 {
    public static void main(String[] args) {
 
        Scanner scn =new Scanner(System.in);

        int k1= scn.nextInt();  // input first no.
        int k2= scn.nextInt();  // input 2'nd no.
        String k3= scn.next();  // input a String

        switch (k3) {
            case "+":
                System.out.println(k1+"+"+k2+"="+(k1+k2));
                break;
            case "-":
                System.out.println(k1+"-"+k2+"="+(k1-k2));
                break;
            case "*":
                System.out.println(k1+"*"+k2+"="+(k1*k2));
                break;
            
            default:
                System.out.println("error");;
        }
        scn.close();

    }
}
