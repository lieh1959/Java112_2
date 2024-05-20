
    /*************Peter code************************************/ 
    import java.util.Scanner;

    public class JPA704_1 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int total1 = 0;
            int total2 = 0;
            int subject = 0;
            int input = scn.nextInt();
            int[] inputarray = new int[input];
            for (int i = 0; i < inputarray.length; i++) {
                inputarray[i] = scn.nextInt();
            }
            for (int i = 0; i < inputarray.length; i++) {
                for (int j = 0; j < inputarray.length; j++) {
                    if (inputarray[i] == inputarray[j]) {
                        total1 += 1;
                    }
                    if (total1 > total2) {
                        total2 = total1;
                        subject = inputarray[i];
                    }
                }
                total1 = 0;
            }
            if (total2 > (input / 2)) {
                System.out.println(subject);
            }
            else
                System.out.println("error");
            scn.close();
        }
    }
