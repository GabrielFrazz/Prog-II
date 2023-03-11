
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        Map<String, String> employees = new HashMap<>();
        
        employees.put("a1234", "Steve Jobs");
        employees.put("a1235", "Scott McNealy");
        employees.put("a1236", "Jeff Bezos");
        employees.put("a1237", "Larry Ellison");
        employees.put("a1238", "Bill Gates");

        System.out.println( employees.get("a1234"));
        System.out.println( employees.get("a1236"));

        System.out.println( employees.get("a1239")); //chave inexistente - retorna nulo
        System.out.println( employees.get("A1234")); //chave inexistente - retorna nulo

        System.out.println(anyKey("A1234", employees));
        System.out.println(employees.get(anyKey("A1234")));


    }

    public static String anyKey(String key, Map<String, String> m){
        return m.get(key.toLowerCase());
    }

    public static String anyKey(String key){
        return key.toLowerCase();
    }
}
