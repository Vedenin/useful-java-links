package gson.advanced;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Example of TreeModel (write and read)
 *
 *
 * Created by vvedenin on 4/24/2016.
 */
public class TreeModel {
    public static void main(String[] args) throws IOException {
        System.out.print("readJson: ");
        readJson();
        System.out.println();
        System.out.print("writeJson: ");
        writeJson();
    }

    /**
     *  Example to readJson using TreeModel
     */
    private static void readJson() throws IOException {
        JsonParser parser = new JsonParser();
        JsonElement jsonElement = parser.parse("{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}");
        JsonObject rootObject = jsonElement.getAsJsonObject();
        String message = rootObject.get("message").getAsString(); // get property "message"
        JsonObject childObject = rootObject.getAsJsonObject("place"); // get place object
        String place = childObject.get("name").getAsString(); // get property "name"
        System.out.println(message + " " + place); // print "Hi World!"*/
    }


    /**
     * Example to writeJson using TreeModel
     */
    private static void writeJson() throws IOException {
        OutputStream outputStream = new ByteArrayOutputStream();

        JsonObject rootObject = new JsonObject();
        rootObject.addProperty("message", "Hi");
        JsonObject childObject = new JsonObject();
        childObject.addProperty("name", "World!");
        rootObject.add("place", childObject);

        Gson gson = new Gson();
        String json = gson.toJson(rootObject);
        System.out.println(json); // print "{"message":"Hi","place":{"name":"World!"}}"
    }
}
