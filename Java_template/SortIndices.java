import java.util.*;

public class SortIndices {
    public int[] get(int[] t) {
        // TODO
    }

    public static void main(String[] args) {
        SortIndices s = new SortIndices();
        System.out.println(Arrays.toString(s.get(new int[] {1,2,4,3}))); // [0,1,3,2]
        System.out.println(Arrays.toString(s.get(new int[] {4,2,1,3}))); // [2,1,3,0]
        System.out.println(Arrays.toString(s.get(new int[] {6,2,8,5,3}))); // [1,4,3,0,2]
    }
}
