public class Connectivity {
    public Connectivity(int n) {
        // TODO
    }

    public void addEdge(int a, int b) {
        // TODO
    }

    public int count() {
        // TODO
    }

    public static void main(String[] args) {
        Connectivity c = new Connectivity(5);
        System.out.println(c.count()); // 4
        c.addEdge(2,4);
        c.addEdge(3,5);
        System.out.println(c.count()); // 2
        c.addEdge(2,3);
        c.addEdge(3,4);
        System.out.println(c.count()); // 1
        c.addEdge(1,2);
        System.out.println(c.count()); // 0
    }
}
