
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("username", "Otong");
        map.put("age", "23");
        map.put("email", "otong@yahoo.com");
        map.put("password", "password");

        Map<String,String> datamap = new HashMap<>();
        datamap.put("username", "Otong");
        datamap.put("haha", "23");
        datamap.put("email", "otong@yahoo.com");
        datamap.put("password", "password");

        String json = "{" +
            map.entrySet().stream().map(e -> "\"" + e.getKey() + "\":" + "\"" + e.getValue() + "\"").collect(Collectors.joining(","))
        + "}";

        System.out.println("Old data json : " + json);

        map.put("username","Anton");

        json = "{" +
            map.entrySet().stream().map(e -> "\"" + e.getKey() + "\":" + "\"" + e.getValue() + "\"").collect(Collectors.joining(","))
        + "}";

        System.out.println("Update Data json : " + json);

        map.remove("username");

        json = "{" +
            map.entrySet().stream().map(e -> "\"" + e.getKey() + "\":" + "\"" + e.getValue() + "\"").collect(Collectors.joining(","))
        + "}";

        System.out.println("Remove Data json : " + json);

        map.put("username","Otong");

        json = "{" +
            map.entrySet().stream().map(e -> "\"" + e.getKey() + "\":" + "\"" + e.getValue() + "\"").collect(Collectors.joining(","))
        + "}";

        System.out.println("Add data json : " + json);

        map.merge("username", " Update", (dataLama, dataTerbaru) -> dataLama.equals("Otong") ? "Putri" : "Otong");

        json = "{" +
            map.entrySet().stream().map(e -> "\"" + e.getKey() + "\":" + "\"" + e.getValue() + "\"").collect(Collectors.joining(","))
        + "}";

        System.out.println("Merge data json : " + json);

        String check = map.compute("username", (key, value) -> key.equals("username") ? "true" : "false");
        if(check.equals("true")) {
            System.out.println("ini adalah nilai true : " + check);
            
        } else {
            System.out.println(check);
        }
    }
}
