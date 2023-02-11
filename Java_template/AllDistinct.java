public class AllDistinct {
    public long count(int[] t) {
        // TODO
    }

    public static void main(String[] args) {
        AllDistinct a = new AllDistinct();
        System.out.println(a.count(new int[] {1,2,3,4,5})); // 15
        System.out.println(a.count(new int[] {1,1,1,1,1})); // 5
        System.out.println(a.count(new int[] {1,2,1,1,2})); // 8
    }
}
