
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] n = new int[3][4];

        for(int i =0; i < n.length; i++) {
            System.out.println(Arrays.toString(n[i]));
            for(int j =0; j < n[i].length; j++) {
                System.out.println(n[i][j]);
                n[i][j] = j + 1;
            }
        }

        int[][] nn = new int[n.length][n[0].length - 2];

        for(int i =0; i < n.length; i++) {
            System.arraycopy(n[i], 0, nn[i], 0, n[0].length - 2);
        }

        System.out.println(Arrays.deepToString(nn));
    }
}
