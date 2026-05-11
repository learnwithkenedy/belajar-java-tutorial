import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silakan masukan hari anda ? ");
        String hari = scanner.nextLine();

        switch(hari) {
            case "senin":
                System.out.println("senin");
                break;
            case "selasa":
                System.out.println("seleasa");
                break;
            case "rabu":
                System.out.println("rabu");
                break;
            case "kamis":
                System.out.println("kamis");
                break;
            case "jum'at":
                System.out.println("jum'at");
                break;
            case "sabtu":
                System.out.println("sabtu");
                break;
            case "minggu":
                System.out.println("minggu");
                break;
            default:
                System.out.println("Hari tidak ditemukan");
                break;
            
        }

        String s = switch(hari) {
            case "senin" -> "senin";
            case "selasa" -> "selasa";
            case "rabu" -> "rabu";
            case "kamis" -> "kamis"; 
            case "jum'at" -> "jum'at";
            case "sabtu" -> "sabtu";
            case "minggu" -> "minggu";
            default -> "Hari tidak ditemukan";
        };
        System.out.println("Variabel Switch Case " + s);

        Object typedata = 10d;

        String typedataVariabel = switch(typedata) {
            case String str -> "ini hari apa " + str;
            case Integer i -> "ini tanggal berapa " + i;
            case Float f -> "nominal uang " + f;
            case Boolean b -> "Apakah hari ini adalah hari senin ? " + b;
            default -> "Type data tidak ditemukan";
        };
        System.out.println(typedataVariabel);
    }
}
