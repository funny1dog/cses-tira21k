public class Boxes {
    public int count(int[] t, int x) {
        // TODO
    }

    public static void main(String[] args) {
        Boxes b = new Boxes();
        System.out.println(b.count(new int[] {1,2,3,4}, 10)); // 2
        System.out.println(b.count(new int[] {4,4,4,4}, 4)); // 4
        System.out.println(b.count(new int[] {7,2,3,9}, 10)); // 3
        System.out.println(b.count(new int[] {4,2,1,5,3}, 6)); // 3
    }
}
