public class Cycles {
    public Cycles(int n) {
        // TODO
    }

    public void addEdge(int a, int b) {
        // TODO
    }

    public boolean check() {
        // TODO
    }

    public static void main(String[] args) {
        Cycles c = new Cycles(4);
        c.addEdge(1,2);
        c.addEdge(2,3);
        c.addEdge(1,3);
        c.addEdge(3,4);
        System.out.println(c.check()); // false
        c.addEdge(4,2);
        System.out.println(c.check()); // true
    }
}
