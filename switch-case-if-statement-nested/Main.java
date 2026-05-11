
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tolong masukan hari anda ? ");
        String hari = scanner.nextLine();

        int x,y,z;

        System.out.print("Tolong masukan nilai x ? ");
        x = scanner.nextInt();
        System.out.print("Tolong masukan nilai y ? ");
        y = scanner.nextInt();
        System.out.print("Tolong masukan nilai z ? ");
        z = scanner.nextInt();

        switch(hari) {
            case "senin":
                if(x == 10 && y == 15) {
                    System.out.println("ini hari " + hari + " dan nilai x adalah " + x + " dan nilai y adalah " + y);
                    if(z == 100) {
                        System.out.println("nilai z adalah " + z);
                    }
                } else {
                    System.out.println("ini hari " + hari + " mohon maaf nilai x dan y tidak ditemukan");
                }
                break;
            case "selasa":
                if(x == 2 && y == 4) {
                    System.out.println("ini hari " + hari + " dan nilai x adalah " + x + " dan nilai y adalah " + y);
                    if(z == 100) {
                        System.out.println("nilai z adalah " + z);
                    }
                }
                else {
                    System.out.println("ini hari " + hari + " mohon maaf nilai x dan y tidak ditemukan");
                    if(z == 100) {
                        System.out.println("nilai z adalah " + z);
                    }
                }
                break;
            case "rabu":
                if(x == 1 && y == 2) {
                    System.out.println("ini hari " + hari + " dan nilai x adalah " + x + " dan nilai y adalah " + y);
                    if(z == 100) {
                        System.out.println("nilai z adalah " + z);
                    }
                }
                else {
                    System.out.println("ini hari " + hari + " mohon maaf nilai x dan y tidak ditemukan");
                }
                break;
            case "kamis":
                if(x == 3 && y == 2) {
                    System.out.println("ini hari " + hari + " dan nilai x adalah " + x + " dan nilai y adalah " + y);
                    if(z == 100) {
                        System.out.println("nilai z adalah " + z);
                    }
                }
                else {
                    System.out.println("ini hari " + hari + " mohon maaf nilai x dan y tidak ditemukan");
                }
                break;
            case "jum'at":
                if(x == 3 && y == 5) {
                    System.out.println("ini hari " + hari + " dan nilai x adalah " + x + " dan nilai y adalah " + y);
                    if(z == 100) {
                        System.out.println("nilai z adalah " + z);
                    }
                }
                else {
                    System.out.println("ini hari " + hari + " mohon maaf nilai x dan y tidak ditemukan");
                }
                break;
            case "sabtu":
                if(x == 3 && y == 5) {
                    System.out.println("ini hari " + hari + " dan nilai x adalah " + x + " dan nilai y adalah " + y);
                    if(z == 100) {
                        System.out.println("nilai z adalah " + z);
                    }
                }
                else {
                    System.out.println("ini hari " + hari + " mohon maaf nilai x dan y tidak ditemukan");
                }
                break;
            default:
                System.out.println("Mohon maaf hari anda tidak ditemukan");
                break;
        }
    }
}