public class Distances {
    public int find(int[] t, int k) {
        // TODO
    }

    public static void main(String[] args) {
        Distances d = new Distances();
        int[] t = {1,2,4,5};
        System.out.println(d.find(t,1)); // 1
        System.out.println(d.find(t,2)); // 1
        System.out.println(d.find(t,3)); // 2
        System.out.println(d.find(t,4)); // 3
        System.out.println(d.find(t,5)); // 3
        System.out.println(d.find(t,6)); // 4
    }
}
