
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tolong tulis hari anda ? ");

        switch (String.format("%s",scanner.nextInt())) {
            case "1":
                System.out.println("ini adalah hari senin");
                break;
            case "Selasa":
                System.out.println("ini adalah hari selasa");
                break;
            case "3":
                System.out.println("ini adalah hari rabu");
                break;
            case "Kamis":
                System.out.println("ini adalah hari kamis");
                break;
            case "Jum'at":
                System.out.println("ini adalah hari jum,'at");
                break;
            case "Sabtu":
                System.out.println("ini adalah hari sabtu");
                break;
            case "Minggu":
                System.out.println("ini adalah hari minggu");
                break;
            default:
                System.out.println("Maaf harinya tidak ketemu");
                break;
        }
    }    
}
