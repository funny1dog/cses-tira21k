import java.util.*;

public class ABCList {
    public ArrayList<String> create(int n) {
        // TODO
    }

    public static void main(String[] args) {
        ABCList a = new ABCList();
        System.out.println(a.create(1)); // [A,B,C]
        System.out.println(a.create(2)); // [AA,AB,AC,BA,BB,BC,CA,CB,CC]
        System.out.println(a.create(5).size()); // 243
    }
}
