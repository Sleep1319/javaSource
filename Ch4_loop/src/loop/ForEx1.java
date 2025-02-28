package loop;
import java.util.Scanner;

public class ForEx1 {
    
    public static void main(String[] args) {
        
        Scanner my_scanner = new Scanner(System.in);
            System.out.print("숫자를 입력하세요: ");
            int my_input = my_scanner.nextInt();
             my_scanner.close(); // Scanner 닫기

            int k = my_input * 2 - 1;

            System.out.println("X 모양의 별 패턴: ");
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= k; j++) {
                    if (j == i || j == k - i + 1) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

}
}