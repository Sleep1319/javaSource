import java.util.Scanner;

public class IfTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년도 입력");

        int num = sc.nextInt();

        if(num % 4 == 0 && num % 100 !=0 || num % 400 == 0) {
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }
    }
    
}
