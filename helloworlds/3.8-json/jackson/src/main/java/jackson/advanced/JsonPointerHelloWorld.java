package jackson.advanced;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 *  Json Path Hello World
 *
  */
public class JsonPointerHelloWorld {

    public  static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(json);
        String author = root.at("/store/book/3/title").asText();
        System.out.println(author); // print ["Hello, Middle-earth! "]

        System.out.println();
        String jsonHiWorld = "{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}\"";
        String message = mapper.readTree(jsonHiWorld).at("/message").asText();
        String place = mapper.readTree(jsonHiWorld).at("/place/name").asText();
        System.out.println(message + " " + place); // print "Hi World!"

    }

    private final static String json = "{\n" +
            "    \"store\": {\n" +
            "        \"book\": [\n" +
            "            {\n" +
            "                \"category\": \"reference\",\n" +
            "                \"author\": \"Nigel Rees\",\n" +
            "                \"title\": \"Sayings of the Century\",\n" +
            "                \"price\": 8.95\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"Evelyn Waugh\",\n" +
            "                \"title\": \"Sword of Honour\",\n" +
            "                \"price\": 12.99\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"Herman Melville\",\n" +
            "                \"title\": \"Moby Dick\",\n" +
            "                \"isbn\": \"0-553-21311-3\",\n" +
            "                \"price\": 8.99\n" +
            "            },\n" +
            "            {\n" +
            "                \"category\": \"fiction\",\n" +
            "                \"author\": \"J. R. R. Tolkien\",\n" +
            "                \"title\": \"Hello, Middle-earth! \",\n" +
            "                \"isbn\": \"0-395-19395-8\",\n" +
            "                \"price\": 22.99\n" +
            "            }\n" +
            "        ],\n" +
            "        \"bicycle\": {\n" +
            "            \"color\": \"red\",\n" +
            "            \"price\": 19.95\n" +
            "        }\n" +
            "    },\n" +
            "    \"expensive\": 10\n" +
            "}";
}
