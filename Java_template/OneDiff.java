public class OneDiff {
    public int find(int[] t) {
        // TODO
    }

    public static void main(String[] args) {
        OneDiff o = new OneDiff();
        System.out.println(o.find(new int[] {1,2,3,4,5})); // 5
        System.out.println(o.find(new int[] {5,5,5,5,5})); // 1
        System.out.println(o.find(new int[] {5,2,3,8,2,4,1})); // 4
    }
}
