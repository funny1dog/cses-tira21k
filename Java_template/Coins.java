public class Coins {
    public int count(int[] t) {
        // TODO
    }

    public static void main(String[] args) {
        Coins c = new Coins();
        System.out.println(c.count(new int[]{3,4,5})); // 7
        System.out.println(c.count(new int[]{1,1,2})); // 4
        System.out.println(c.count(new int[]{2,2,2,3,3,3})); // 13
        System.out.println(c.count(new int[]{42,5,5,100,1,3,3,7})); // 91
    }
}
