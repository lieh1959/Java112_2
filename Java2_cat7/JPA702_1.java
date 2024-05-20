/****************by peter***************************** */
import java.util.Scanner;

public class JPA702_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        int total = 0;
        String input = scn.nextLine();
        String[] array = input.split("");  //將輸入的字串拆解成陣列array
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals("1")) {
                total += Math.pow(2, count);
            }
            count += 1;
        }
        System.out.println(total);
        scn.close();
    }
}
