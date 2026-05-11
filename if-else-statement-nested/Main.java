public class Main {
    public static void main(String[] args) {
        int a = 40;
        int b = 4;

        if (a == 5) {
            if (b == 15) {
                System.out.println("Nilai A sama dengan 5 dan B sama dengan 15");
            } else {
                System.out.println("Nilai A sama dengan 5 dan B tidak sama dengan 15");
            }
        } else if(a == 10) {
            if (b == 20) {
                System.out.println("Nilai A sama dengan 10 dan B sama dengan 20");
            } else {
                System.out.println("Nilai A sama dengan 10 dan B tidak sama dengan 20");
            }
        } else {
            System.out.println("Nilai A tidak ada");
        }

        System.out.println("Finish");
    }    
}
