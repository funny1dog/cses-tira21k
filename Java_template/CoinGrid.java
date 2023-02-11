public class CoinGrid {
    public int count(String[] r) {
        // TODO
    }

    public static void main(String[] args) {
        CoinGrid c = new CoinGrid();
        String[] r = {"........",
                      "........",
                      "...X..X.",
                      "........",
                      "....X...",
                      "..X.X..X",
                      "........",
                      "....X..."};
        System.out.println(c.count(r)); // 3
    }
}
