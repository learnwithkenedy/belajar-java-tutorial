import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int lebar, tinggi, luas;
        
        lebar = scanner.nextInt();
        System.out.println("Angka Lebar : " + lebar);

        tinggi = scanner.nextInt();
        System.out.println("Angka Tinggi : " + tinggi);

        luas = lebar * tinggi;
        System.out.println("Total luas : " + luas);
    }    
}
