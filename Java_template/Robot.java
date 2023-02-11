public class Robot {
    public int count(String s) {
        // TODO
    }
    
    public static void main(String[] args) {
        Robot r = new Robot();
        System.out.println(r.count("LL")); // 3
        System.out.println(r.count("UUDLRR")); // 5
        System.out.println(r.count("UDUDUDU")); // 2
    }
}
