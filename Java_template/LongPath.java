public class LongPath {
    public LongPath(int n) {
        // TODO
    }

    public void addEdge(int a, int b) {
        // TODO
    }

    public int calculate() {
        // TODO
    }

    public static void main(String[] args) {
        LongPath l = new LongPath(4);
        l.addEdge(1,2);
        l.addEdge(1,3);
        l.addEdge(2,4);
        l.addEdge(3,4);
        System.out.println(l.calculate()); // 2
        l.addEdge(3,2);
        System.out.println(l.calculate()); // 3
    }
}
