public class Main {
    public static void main(String[] args) {
        // Array
        String[] strings = {"Ayam", "Kucing", "Ikan", "Bebek"};

        // For Loop, ketika ingin mengeluarkan data harus menggunakan index
        for(int i =0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        // For Each
        for(String value: strings) {
            System.out.println("Nama hewan adalah : " + value);
        }
    }    
}
