public class Breakwall {
    public int count(String[] r) {
        // TODO
    }

    public static void main(String[] args) {
        Breakwall b = new Breakwall();
        String[] r = {"########",
                      "#*A*...#",
                      "#.*****#",
                      "#.**.**#",
                      "#.*****#",
                      "#..*.B.#",
                      "########"};
        System.out.println(b.count(r)); // 2
    }
}
