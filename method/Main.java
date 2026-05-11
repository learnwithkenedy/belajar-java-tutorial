public class Main {
    public static void main(String[] args) {
        printNama("Cinta");
        System.out.println(printUmur(22));
        printNama("Aak");
        printNama("Cantik");

        int[] data = {1,2,3,4};

        System.out.println(data);
    }

    // void adalah fungsi untuk tanpa mengirim data/value
    public static void printNama(String nama) {
        System.out.println("Selamat pagi " + nama);
    }

    // kita menggunakan return, untuk mengirim data/value
    // char, integer, string, byte, double, long, boolean
    public static String printUmur(Integer umur) {
        return "Umur kamu berapa " + umur;
    };
}
