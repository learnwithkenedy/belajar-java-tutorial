import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String name = "Kenedy";
        int age = 22;
        double salary = 1000000;

        String str = String.format("name: %s age: %d salary: Rp%,8.2f",name,age,salary);

        System.out.println(str);

        System.out.printf("%tF \n %tc \n %tr\n %tD \n", new Date(), new Date(), new Date(), new Date());
    }
}