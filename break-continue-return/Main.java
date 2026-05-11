
public class Main {
    public static void main(String[] args) {
        boolean start = true;

        int nilai = 0;

        while(start) {
            nilai++;
            if(nilai == 9) {
                break;
                // ketika nilai 2 sama dengan 2, break akan melakukan stop secara otomatis logic whileloop
            } else  if(nilai == 3) {
                continue;
            } else if(nilai == 5) {
                return;
                // ketika nilai 4 sama dengan 4, maka aplikasi java finish/selesai secara otomatis
            }
            System.out.println("System berjalan " + nilai);
            // ketika continue line ini tidak akan dieksekusi kembali
        }
    }
}