import java.util.Scanner;

public class JPA606 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String[] input = new String[3];
        for (int i = 0; i < 3; i++) {
            input[i] = scan.nextLine();
        }
        run(input);
    }

    public static void run(String[] input) {
        //int count = 0;
        for (String in : input) {
             /*
            if (count != 0) {       
                System.out.println();
            }
            count++;  */
            
            String[] inList = in.split("");
            
            int sum = ((Integer.parseInt(inList[0]) +
                 Integer.parseInt(inList[2]) + 
                Integer.parseInt(inList[4])) + 
                (Integer.parseInt(inList[1]) + Integer.parseInt(inList[3])) * 5) % 26;  //s5的判斷規則
            if (((char) (sum + 'A' - 1)) == in.charAt(5)) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
