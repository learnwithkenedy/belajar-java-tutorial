
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.println(10);
        System.out.println(Arrays.toString(arr));

        System.out.println("index: 3 adalah :" + arr[3]);

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("index : %d, value: %d\n", i, arr[i]);
        }
    }
}
