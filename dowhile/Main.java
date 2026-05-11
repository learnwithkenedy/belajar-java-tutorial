
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean start = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Mohon masukan nilai anda ? ");
            int nilai = scanner.nextInt();
            if(nilai == 12) {
                start = false;
            }
            nilai++;
            System.out.println("Aplikasi berjalan");
        } while(start);
    }    
}
