package ifTest;
import java.util.Scanner;

public class SwitchTest1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // 1 가위, 2 바위, 3 보
        int num = (int)(Math.random()*3 + 1);
        int cum = (int)(Math.random()*3 + 1);
        System.out.println("유저: " + num + ", 컴퓨터: " + cum);

        switch (num - cum) {
            case 1 :
                System.out.println("유저 승리");
                break;
            case -2 :
                System.out.println("유저 승리");
                break;
            case 0 : 
                System.out.println("비김");
                break;
            default:
            System.out.println("컴퓨터 승리");
                break;
        }
    }
    
}
