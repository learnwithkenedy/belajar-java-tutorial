public class Main {
    public static void main(String[] args) {
        printAngka(10);
        printAngka(10F);
        printAngka(10D);
        printAngka(10L);
        printAngka((byte) 10);

        System.out.println("Nilai dari Float + Integer = " + tambah(10f, 10));
        System.out.println("Nilai dari Float + Double = " + tambah( 10f,10d));
    }

    // ini adalah Overload Method

    public static float tambah(Float f, Integer n) {
        return f + n;
    }

    public static double tambah(Float f, Double n) {
        return f + n;
    }

    public static void printAngka(Integer n) {
        System.out.println("ini adalah printAngka dari Integer : " + n);
    }
    public static void printAngka(Float n) {
        System.out.println("ini adalah printAngka dari Float : " + n);
    }
    public static void printAngka(Double n) {
        System.out.println("ini adalah printAngka dari Double : " + n);
    }
    public static void printAngka(Long n) {
        System.out.println("ini adalah printAngka dari Long : " + n);
    }
    public static void printAngka(Byte n) {
        System.out.println("ini adalah printAngka dari Byte : " + n);
    }
}
