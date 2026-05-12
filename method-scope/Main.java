public class Main {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("nilai x adalah " + x);

        // Method Scope

        {
            int y = 20;
            System.out.println( "nilai y adalah " +y);
            y = x;
            System.out.println("nilai y adalah " + x);

        }

        // System.out.println("Mengambil nilai y dari luar method scope" + y);
    }

    public static void method() {

    }
}