package json_simple;


import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 * Json-Java Hello World
 */
public class JsonSimpleHelloWorld {

    public static void main(String[] args) {
        // convert Java to json
        JSONObject root = new JSONObject();
        root.put("message", "Hi");
        JSONObject place = new JSONObject();
        place.put("name", "World!");
        root.put("place", place);
        String json = root.toJSONString();
        System.out.println(json);

        System.out.println();
        // convert json to Java
        JSONObject obj = (JSONObject) JSONValue.parse(json);
        String message = (String) obj.get("message");
        place = (JSONObject) obj.get("place");
        String name = (String) place.get("name");
        System.out.println(message + " " + name);
    }
}
