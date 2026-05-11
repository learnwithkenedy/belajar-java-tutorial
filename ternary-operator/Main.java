
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nilai anda: ");
        int nilai = scanner.nextInt();

        int hasil = nilai == 10 ? nilai * 2 : nilai == 15 ? nilai * 10 :  nilai / 5;

        // ini adalah if
        
        // if(nilai == 10) {
        //     hasil = nilai * 2;
        // } else {
        //     hasil = nilai/ 5;
        // }
        
        System.out.println("hasilnya adalah ? " + hasil);
    }    
}
