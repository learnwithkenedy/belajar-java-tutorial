public class Main {
    public static void main(String[] args) {
        int a,b;

        a = 12;
        b = 12;
        
        // Sama dengan a (10) == b (10) ? true
        Boolean hasilKomparasi = (a == b);

        System.out.printf("apakah a (%d) sama dengan b (%d) = %b (Tidak)\n", a, b, hasilKomparasi);

        // Tidak sama dengan a (10) != b (10) ? false
        hasilKomparasi = (a != b);

        System.out.printf("apakah a (%d) tidak sama dengan b (%d) = %b (Ya)\n", a, b, hasilKomparasi);

        // A Lebih besar dari B
        hasilKomparasi = a > b;
        System.out.printf("apakah A lebih besar dari B = %b (Ya)\n", hasilKomparasi);

        // A Tidak lebih besar dari B
        hasilKomparasi = a < b;
        System.out.printf("apakah A tidak lebih besar dari B = %b (Tidak)\n", hasilKomparasi);

        // A Lebih besar dari atau sama dengan B
        hasilKomparasi = a >= b;
        System.out.printf("apakah A Lebih besar dari atau sama dengan B = %b (Ya)\n", hasilKomparasi);

        // A Tidak lebih besar dari atau sama dengan B
        hasilKomparasi = a <= b;
        System.out.printf("apakah A tidak lebih besar dari atau sama dengan B = %b (Ya)\n", hasilKomparasi);
    }    
}
