public class Coloring {
    public Coloring(int n) {
        // TODO
    }

    public void addEdge(int a, int b) {
        // TODO
    }

    public boolean check() {
        // TODO
    }

    public static void main(String[] args) {
        Coloring c = new Coloring(4);
        c.addEdge(1,2);
        c.addEdge(2,3);
        c.addEdge(3,4);
        c.addEdge(1,4);
        System.out.println(c.check()); // true
        c.addEdge(2,4);
        System.out.println(c.check()); // false
    }
}
