package json_java;

import org.json.JSONObject;

/**
 *  Json-Java Hello World
 *
  */
public class JsonJavaHelloWorld {

    public static void main(String[] args) {
        // convert Map to json
        String json = new JSONObject().put("JSON", "Hello, World!").toString();
        System.out.println(json);

        System.out.println();

        // convert json to Map
        JSONObject jsonObject = new JSONObject(json);
        String message = jsonObject.get("JSON").toString();
        System.out.println(message);
    }
}
