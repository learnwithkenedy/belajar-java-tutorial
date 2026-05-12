
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama hewan : ");
        String nama = scanner.nextLine();

        switch(nama) {
            case "ayam":
                System.out.println("Ayam");
                break;
            case "ikan":
                System.out.println("Ikan");
                break;
            case "burung":
                System.out.println("Burung");
                break;
            case "lele":
                System.out.println("Lele");
                break;
            default:
                System.out.println("Mohon maaf keyword tidak ditemukan");
                break;
        }

        String variabelSwitch = switch(nama) {
            case "ikan" -> "Ikan";
            case "ayam" -> "Ayam";
            case "burung" -> "Burung";
            case "lele" -> "Lele";
            default -> "Mohon maaf keyword tidak ditemukan";
        };
        System.out.println("Nama hewan adalah ? " + variabelSwitch);

        switch(nama.toLowerCase()) {
            case "ayam":
            case "kucing":
                System.out.println("Ayam Atau Kucing");
                break;
            case "ikan":
                System.out.println("Ikan");
                break;
            case "burung":
                System.out.println("Burung");
                break;
            case "lele":
                System.out.println("Lele");
                break;
            default:
                System.out.println("Mohon maaf keyword tidak ditemukan");
                break;
        }
    }
}