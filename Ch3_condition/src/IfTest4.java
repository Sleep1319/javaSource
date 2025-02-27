import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        int max = num1;
        int min = num3;

        if(max < num2) {
            max = num2;
        }
        if(max < num3) {
            max = num3;
        }
        if(min > num1) {
            min = num1;
        }
        if(min > num1) {
            min = num1;
        }
        System.out.println("최고: " + max + "최소: " + min);
    }
}
