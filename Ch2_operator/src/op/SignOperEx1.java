package op;

public class SignOperEx1 {
    
    public static void main(String[] args) {
        int a = 10, b = 4;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(+a);
        System.out.println(-b);
        System.out.println(a + "전위" + ++a);
        System.out.println(a + "후위" + a++);
        System.out.println("전 내용이 후위 그래서 저 줄이 끝난 뒤 값12: "+ a);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
    }
}
