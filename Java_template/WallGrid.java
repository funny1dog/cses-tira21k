public class WallGrid {
    public WallGrid(int n) {
        // TODO
    }

    public void remove(int x, int y) {
        // TODO
    }

    public int count() {
        // TODO
    }

    public static void main(String[] args) {
        WallGrid w = new WallGrid(5);
        System.out.println(w.count()); // 0
        w.remove(2,2);
        w.remove(4,2);
        System.out.println(w.count()); // 2
        w.remove(3,2);
        System.out.println(w.count()); // 1
        w.remove(2,4);
        w.remove(2,4);
        w.remove(4,4);
        System.out.println(w.count()); // 3
        w.remove(3,3);
        System.out.println(w.count()); // 3
        w.remove(3,4);
        System.out.println(w.count()); // 1
    }
}
