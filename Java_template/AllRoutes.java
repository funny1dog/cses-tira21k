import java.util.*;

public class AllRoutes {
    public AllRoutes(int n) {
        // TODO
    }

    public void addRoad(int a, int b, int x) {
        // TODO
    }

    public int[][] getTable() {
        // TODO
    }

    public static void main(String[] args) {
        AllRoutes a = new AllRoutes(4);
        a.addRoad(1,2,2);
        a.addRoad(1,3,5);
        a.addRoad(2,3,1);
        System.out.println(Arrays.deepToString(a.getTable()));
        // [[0,2,3,-1],[2,0,1,-1],[3,1,0,-1],[-1,-1,-1,0]]
    }
}
