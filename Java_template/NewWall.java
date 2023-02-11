public class NewWall {
    public int count(String[] r) {
        // TODO
    }

    public static void main(String[] args) {
        NewWall n = new NewWall();
        String[] r = {".....",
                      ".###.",
                      "...#.",
                      "##.#.",
                      "....."};
        System.out.println(n.count(r)); // 2
    }
}
