
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean start = true;
        Scanner scanner = new Scanner(System.in);

        int nilai = 0;

        while(start) { // Default value / nilai awal true
            System.out.print("Masukan nilai anda :");
            nilai = scanner.nextInt();
            if(nilai == 10) {
                start = false;
            }
            nilai++;
        }
    }
}
