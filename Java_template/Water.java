import java.util.*;

public class Water {
    public int count(int a, int b, int x) {
        // TODO
    }

    public static void main(String[] args) {
        Water w = new Water();
        System.out.println(w.count(5,4,2)); // 22
        System.out.println(w.count(4,3,2)); // 16
        System.out.println(w.count(3,3,1)); // -1
        System.out.println(w.count(10,9,8)); // 46
        System.out.println(w.count(123,456,42)); // 10530
    }
}
