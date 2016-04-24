package json_java;

import org.json.JSONObject;

/**
 *  Json-Java Hello World
 *
  */
public class JsonJavaHelloWorld {

    public static void main(String[] args) {
        // convert Java to json
        JSONObject root = new JSONObject();
        root.put("message", "Hi");
        JSONObject place = new JSONObject();
        place.put("name", "World!");
        root.put("place", place);
        String json = root.toString();
        System.out.println(json);

        System.out.println();
        // convert json to Java
        JSONObject jsonObject = new JSONObject(json);
        String message = jsonObject.getString("message");
        String name = jsonObject.getJSONObject("place").getString("name");
        System.out.println(message + " " + name);
    }
}
