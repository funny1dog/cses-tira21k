import java.util.*;

public class ABCDiff {
    public ArrayList<String> create(int n) {
        // TODO
    }

    public static void main(String[] args) {
        ABCDiff a = new ABCDiff();
        System.out.println(a.create(1)); // [A,B,C]
        System.out.println(a.create(2)); // [AB,AC,BA,BC,CA,CB]
        System.out.println(a.create(5).size()); // 48
    }
}
