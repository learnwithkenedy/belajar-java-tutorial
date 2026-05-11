public class Main {
    public static void main(String[] args) {
        // * / % + -
        int a,b,c;

        a = 2;
        b = 10;
        c = 5;
        // akan dihitung nilainya dari kanan
        int hasil = c + 2 / a * b; 
        // a * b = 20
        // 2 / 20 = 10
        // 5 + 10 = 15
        System.out.println("c + a * b = " + hasil);

        // akan dihitung nilainya dari kiri
        hasil = c / a * b;
        System.out.println("a / c * b = " + hasil);

        // pengelompokan
        hasil = (c + a) * b;
        System.out.println("c + a * b = " + hasil);
        
    }    
}
