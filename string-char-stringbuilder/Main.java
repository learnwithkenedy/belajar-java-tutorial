
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "HeLLo";
        // Char ini adalah satuan karakter atau symbol
        // symbol 😁
        char[] c = {'h','e','l','l','o'};

        System.out.println(str + " World");

        System.out.println("ini adalah string : " + str);
        System.out.println("ini adalah string contains : " + str.contains("Hellos"));
        // equals ==
        // Hello World
        System.out.println("ini adalah string equals : " + str.equals("hello"));
        System.out.println("ini adalah string equalsIgnoreCase : " + str.equalsIgnoreCase("HELLO"));
        System.out.println("ini adalah string to lowercase : " + str.toLowerCase());
        System.out.println("ini adalah string to uppercase : " + str.toUpperCase());
        System.out.println("ini adalah string length : " + str.length());
        System.out.println("ini adalah string ke char : " + str.charAt(0));
        System.out.println("ini adalah char : " + Arrays.toString(c));
        System.out.println("ini adalah char length: " + c.length);
        String charToString = "";

        for(int i = 0; i < c.length; i++) {
            charToString += c[i];
            charToString = charToString.toUpperCase();
        }
        System.out.println("ini adalah char from forloop to string : " + charToString);

        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World");
        builder.delete(0, 4);
        String builderToString = builder.toString();
        System.out.println("ini adalah string builder : " + builder);
        System.out.println("ini adalah string builder to string : " + builderToString);
    }
}
