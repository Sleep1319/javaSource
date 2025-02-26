package op;

public class SignOperEx1 {
    
    public static void main(String[] args) {
        int a = 10, b = 4;

        System.out.println("사칙");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (float)b);
        System.out.println(a % b);
        System.out.println("비교");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println("논리");
        System.out.println(a < b && a < b);
        System.out.println(a > b && a < b);
        System.out.println(a > b && a > b);
        System.out.println(a < b || a < b);
        System.out.println(a > b || a < b);
        System.out.println(a > b || a > b);
        System.out.println("전 후");
        System.out.println(+a);
        System.out.println(-b);
        System.out.println(a + "전위" + ++a);
        System.out.println(a + "후위" + a++);
        System.out.println("전 내용이 후위 그래서 저 줄이 끝난 뒤 값12: "+ a);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
        System.out.println("스트링은 그리 배웠는데 모르면 어후");
    }
}
