package minimal_json;


import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonObject;

import java.io.IOException;
import java.io.StringWriter;

/**
 * Json-Java Hello World
 */
public class JsonMinimalHelloWorld {

    public static void main(String[] args) throws IOException {
        // convert Java to writer
        JsonObject root = Json.object().add("message", "Hi").add(
                "place", Json.object().add("name", "World!")
        );
        StringWriter writer = new StringWriter();
        root.writeTo(writer);
        String json = writer.toString();
        System.out.println(json);

        System.out.println();
        // convert writer to Java
        JsonObject obj = Json.parse(json).asObject();
        String message = obj.get("message").asString();
        String name = obj.get("place").asObject().get("name").asString();
        System.out.println(message + " " + name);
    }
}
