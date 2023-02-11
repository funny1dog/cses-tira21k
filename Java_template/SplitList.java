public class SplitList {
    public int count(int[] t) {
        // TODO
    }

    public static void main(String[] args) {
        SplitList s = new SplitList();
        System.out.println(s.count(new int[] {1,2,3,4,5})); // 4
        System.out.println(s.count(new int[] {5,4,3,2,1})); // 0
        System.out.println(s.count(new int[] {2,1,2,5,7,6,9})); // 3
        System.out.println(s.count(new int[] {1,2,3,1})); // 0
    }
}
