public class Monsters {
    public int count(String[] r) {
        // TODO
    }

    public static void main(String[] args) {
        Monsters m = new Monsters();
        String[] r = {"....@",
                      "@##.#",
                      ".##@#",
                      ".@..#",
                      "###@."};
        System.out.println(m.count(r)); // 2
    }
}
