public class BitErase {
    public long count(String s) {
        // TODO
    }

    public static void main(String[] args) {
        BitErase b = new BitErase();
        System.out.println(b.count("1100")); // 2
        System.out.println(b.count("1001")); // 1
        System.out.println(b.count("100111")); // 5
        System.out.println(b.count("11001")); // 0
        System.out.println(b.count("1100110011100111")); // 113925
    }
}
