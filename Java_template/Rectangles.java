public class Rectangles {
    public long area(int rec1[], int rec2[], int rec3[]) {
        // TODO
    }
    
    public static void main(String[] args) {
        Rectangles r = new Rectangles();
        int[] rec1 = {-1,1,1,-1};
        int[] rec2 = {0,3,2,0};
        int[] rec3 = {0,2,3,-2};
        System.out.println(r.area(rec1,rec2,rec3)); // 16
    }
}
