public class Main {
    public static void main(String[] args) {
        printAngka(1);
    }


    public static void printAngka(Integer n) {
        System.out.println("Angka berjalan : " + n);
        n++;
        if(n == 100) {
            return;
        }
        // ini adalah rekursif/recursive
        // method yang memanggil dirinya sendiri
        printAngka(n);
    }
}
