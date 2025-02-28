package ifTest;
public class IfTest1 {
    public static void main(String[] args) {
        
        int a = 10, b = 4;

        if(a > b) {
            System.out.println("트루");
        } 

        if(a < b) {
            System.out.println("거짓");
        }
        System.out.println("---------");

        int c = (int) (Math.random() * 6) + 1;
        System.out.println(c);
        int d = (int) (Math.random() * 100) + 1;
        System.out.println(d);
    }
}
