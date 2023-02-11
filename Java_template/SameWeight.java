public class SameWeight {
    public SameWeight(int n) {
        // TODO
    }

    public void addEdge(int a, int b, int x) {
        // TODO
    }

    public boolean check() {
        // TODO
    }

    public static void main(String[] args) {
        SameWeight s = new SameWeight(4);
        s.addEdge(1,2,2);
        s.addEdge(1,3,3);
        System.out.println(s.check()); // true
        s.addEdge(1,4,3);
        System.out.println(s.check()); // true
        s.addEdge(3,4,3);
        System.out.println(s.check()); // true
        s.addEdge(2,4,1);
        System.out.println(s.check()); // false
    }
}
