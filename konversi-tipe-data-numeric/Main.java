public class Main {
    public static void main(String[] args) {
      int x = 50;
      int y = 50;

      int hasil = x + y;

      System.out.println("===== INTEGER ======");

      System.out.println(x + " + " + y + " = " + hasil);

      long hasillong = hasil;

      System.out.println("===== LONG ======");

      System.out.println(x + " + " + y + " = " + hasillong);

      byte hasilbyte = (byte) hasil;

      System.out.println("===== INTEGER KE BYTE ======");

      System.out.println(x + " + " + y + " = " + hasilbyte);

      System.out.println("max : " + Byte.MAX_VALUE + " bytes");
      System.out.println("max : " + Byte.SIZE + " bit");

      int a = 10;
      int b = 8;

      float hasilfloat = (float) a / b;

      System.out.println("===== INTEGER KE FLOAT ======");

      System.out.println(a + " / " + b + " = " + hasilfloat);
   }
}