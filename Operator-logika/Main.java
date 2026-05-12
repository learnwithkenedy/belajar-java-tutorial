public class Main {
  public static void main(String[] args) {
    // AND, OR, XOR, NOT

    Boolean a = true;
    Boolean b = false;

    // ini adalah operator OR
    System.out.printf("%b OR %b = %b\n", a, b, (a || b));

    b = true;
    System.out.printf("%b OR %b = %b\n", a, b, (a || b));

    a = false;
    b = false;
    System.out.printf("%b OR %b = %b\n", a, b, (a || b));

    // ini adalah operator AND
    System.out.printf("%b AND %b = %b\n", a, b, (a && b));

    b = true;
    System.out.printf("%b AND %b = %b\n", a, b, (a && b));

    a = false;
    b = false;
    System.out.printf("%b AND %b = %b\n", a, b, (a && b));

    a = true;
    b = true;
    System.out.printf("%b AND %b = %b\n", a, b, (a && b));

    // ini adalah operator XOR (^)
    b = false;
    System.out.printf("%b ^ %b = %b\n", a, b, (a ^ b));

    b = true;
    System.out.printf("%b ^ %b = %b\n", a, b, (a ^ b));

    a = false;
    b = false;
    System.out.printf("%b ^ %b = %b\n", a, b, (a ^ b));

    a = true;
    System.out.printf("NOT %b\n", !a);

    a = false;
    System.out.printf("NOT %b\n", !a);
  }
}
