package json_path;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

import java.util.List;
import java.util.Map;

/**
 *  Json Path Hello World
 *
  */
public class JsonPathHelloWorld {

    public  static void main(String[] args) {
        List<String> authors = JsonPath.read(json, "$.store.book[*].author");
        System.out.println("authors: " + authors); // print ["Nigel Rees","Evelyn Waugh","Herman Melville","J. R. R. Tolkien"]

        List<Map<String, Object>> expensiveBooks = JsonPath
                .using(Configuration.defaultConfiguration())
                .parse(json)
                .read("$.store.book[?(@.price > 22)].title", List.class);

        System.out.println(expensiveBooks); // print ["Hello, Middle-earth! "]

        System.out.println();
        String jsonHiWorld = "{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}\"";
        String message = JsonPath.read(jsonHiWorld, "$.message");
        String place = JsonPath.read(jsonHiWorld, "$.place.name");
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
