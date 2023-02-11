public class FlipList {
    public void pushLast(int x) {
        // TODO
    }

    public void pushFirst(int x) {
        // TODO
    }

    public int popLast() {
        // TODO
    }

    public int popFirst() {
        // TODO
    }

    public void flip() {
        // TODO
    }

    public static void main(String[] args) {
        FlipList f = new FlipList();
        f.pushLast(1);
        f.pushLast(2);
        f.pushLast(3);
        System.out.println(f.popFirst()); // 1
        f.flip();
        System.out.println(f.popFirst()); // 3
    }
}
