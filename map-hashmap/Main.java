
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {
            Map<String,Object> map = new HashMap<>();
            map.put("username", "username");
            map.put("email", "email@yahoo.com");
            map.put("age", 22);
            map.put("gender",true);
            map.put("nilaiFloat", 10f);
            map.put("nilaiDouble",100d);

            String json = "{" +
             map.entrySet().stream().map(e -> "\"" + e.getKey() + "\":" + e.getValue() + "\"").collect(Collectors.joining(","))
             + 
             "}";

            System.out.println(map);
        }
}
