package jackson.advanced;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Example of TreeModel (write and read)
 *
 * Of 3 major processing modes that Jackson supports, Tree Model may be most familiar to developers with experience using XML
 * as the main data/transfer format. At conceptual level it has many similarities to DOM XML tree model; although there are
 * also many differences due to structural and semantic differences between JSON and XML.
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
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readValue("{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}", JsonNode.class);
        String message = rootNode.get("message").asText(); // get property message
        JsonNode childNode =  rootNode.get("place"); // get object Place
        String place = childNode.get("name").asText(); // get property name
        System.out.println(message + " " + place); // print "Hi World!"
    }


    /**
     * Example to writeJson using TreeModel
     */
    private static void writeJson() throws IOException {
        OutputStream outputStream = new ByteArrayOutputStream();

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode rootNode = mapper.createObjectNode();
        rootNode.put("message", "Hi");
        ObjectNode childNode = rootNode.putObject("place");
        childNode.put("name", "World!");
        mapper.writeValue(outputStream, childNode);

        System.out.println(outputStream.toString()); // print "{"message":"Hi","place":{"name":"World!"}}"
    }
}
