package array;

import java.util.ArrayList;

public class ArrayEx1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum = (int)(Math.random() * 100 +1);
            arrayList.add(sum);
            System.out.println("들어간 수: " + sum);
        }

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println("체크: " + arrayList.get(i));
        }

        System.out.println("toString 이용:" + arrayList.toString());
    }
}
