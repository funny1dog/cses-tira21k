public class Chambers {
    public int count(String[] r) {
        // TODO
    }

    public static void main(String[] args) {
        Chambers c = new Chambers();
        String[] r = {"########",
                      "#..#...#",
                      "####.#.#",
                      "#..#.#.#",
                      "########"};
        System.out.println(c.count(r)); // 3
    }
}
