import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger integer = new BigInteger("1000");
        // add +
        // 1000 + 1000
        BigInteger sum = integer.add(BigInteger.valueOf(1000));
        BigInteger multiply = integer.multiply(BigInteger.valueOf(4));
        BigInteger divide = integer.divide(BigInteger.valueOf(2));
        BigInteger modulus = integer.mod(BigInteger.valueOf(3));
        BigInteger subtract = integer.subtract(BigInteger.valueOf(900));

        System.out.println("ini adalah nilai awal : " + integer);
        System.out.println("ini adalah sum + : " + sum);
        System.out.println("ini adalah multiply * : " + multiply);
        System.out.println("ini adalah divide / : " + divide);
        System.out.println("ini adalah modulus % : " + modulus);
        System.out.println("ini adalah subtract - : " + subtract);

        BigDecimal decimal = new BigDecimal("1000");
        // add +
        // 1000 + 1000
        BigDecimal dsum = decimal.add(BigDecimal.valueOf(1000));
        BigDecimal dmultiply = decimal.multiply(BigDecimal.valueOf(4));
        BigDecimal ddivide = decimal.divide(BigDecimal.valueOf(2));
        BigDecimal dsubtract = decimal.subtract(BigDecimal.valueOf(900));

        System.out.println("========= BIG DECIMAL ============");
        
        System.out.println("ini adalah nilai awal : " + decimal);
        System.out.println("ini adalah sum + : " + dsum);
        System.out.println("ini adalah multiply * : " + dmultiply);
        System.out.println("ini adalah divide / : " + ddivide);
        System.out.println("ini adalah subtract - : " + dsubtract);
    }   
}
