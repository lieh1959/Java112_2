/********************by 許倖諴******************************* */
import java.io.*;
import java.util.Scanner;

public class JPA706_1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int count = 4;
        Scanner scanner = new Scanner(System.in);

        // 從鍵盤讀取數字
        for (int i = 0; i < 4; i++) {
            a[i] = scanner.nextInt();
        }

        // 從檔案讀取數字
        try (Scanner fileScanner = new Scanner(new File("read.txt"))) {
            while (fileScanner.hasNextInt() && count < a.length) {
                a[count++] = fileScanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: read.txt");
            return;
        }

        // 冒泡排序
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

        // 將結果輸出到控制台和檔案
        try (PrintWriter writer = new PrintWriter("write.txt")) {
            for (int i = 0; i < count; i++) {
                System.out.println(a[i]);
                writer.println(a[i]);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cannot write to file: write.txt");
        }

        scanner.close();
    }
}
