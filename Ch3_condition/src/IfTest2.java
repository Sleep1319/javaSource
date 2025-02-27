import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args) {

        System.out.println("입력해라: ");
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num == 0) {
            System.out.println("0은 제외");
        } else if (num / 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
