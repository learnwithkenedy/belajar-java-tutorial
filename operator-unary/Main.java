public class Main {
    public static void main(String[] args) {
        // Operator unary

        int x = 1;
        System.out.printf("nilai unary '-' %d tanpa '-' %d\n", -x, x);
        System.out.printf("nilai unary '+' %d tanpa '+' %d\n", +x, x);

        // Operator Increment dan Decrement

        // ini adalah increment
        x++;
        x++;
        System.out.printf("nilai dari increment : %d\n", x);

        // ini adalah decrement
        x--; // x itu adalah 3 - 1 = 2
        x--; // x itu adalah 2 - 1 = 1
        System.out.printf("nilai dari decrement : %d\n", x);

        x = 5;
        System.out.printf("nilai dari x = %d \n", --x);
        System.out.printf("nilai dari x = %d \n", x--);
        System.out.printf("nilai dari x = %d \n", x);
    }    
}
