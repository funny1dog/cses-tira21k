import java.util.*;

public class Zigzag {
    public int[] create(int n) {
        // TODO
    }

    public static void main(String[] args) {
        Zigzag z = new Zigzag();
        System.out.println(Arrays.toString(z.create(1))); // [1]
        System.out.println(Arrays.toString(z.create(2))); // [1,2]
        System.out.println(Arrays.toString(z.create(3))); // [3,1,2]
        System.out.println(Arrays.toString(z.create(4))); // [3,1,2,4]
        System.out.println(Arrays.toString(z.create(5))); // [5,3,1,2,4]
    }
}
