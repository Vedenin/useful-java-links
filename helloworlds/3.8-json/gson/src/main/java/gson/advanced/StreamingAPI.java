package gson.advanced;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Example of StreamingAPI (write and read)
 *
 * Created by vvedenin on 4/24/2016.
 */
public class StreamingAPI {
    public static void main(String[] args) throws IOException {
        System.out.print("readJson: ");
        readJson();
        System.out.println();
        System.out.print("writeJson: ");
        writeJson();
    }

    /**
     *  Example to readJson using StreamingAPI
     */
    private static void readJson() throws IOException {
        String str = "{\"message\":\"Hi\",\"place\":{\"name\":\"World!\"}}";
        InputStream in = new ByteArrayInputStream(str.getBytes(Charset.forName("UTF-8")));
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        while (reader.hasNext()) {
            JsonToken jsonToken = reader.peek();
            if(jsonToken == JsonToken.BEGIN_OBJECT) {
                reader.beginObject();
            } else if(jsonToken == JsonToken.END_OBJECT) {
                reader.endObject();
            } if(jsonToken == JsonToken.STRING) {
                System.out.print(reader.nextString() + " "); // print Hi World!
            } else {
                reader.skipValue();
            }
        }
        reader.close();
    }

    /**
     * Example to writeJson using StreamingAPI
     */
    private static void writeJson() throws IOException {
        OutputStream outputStream = new ByteArrayOutputStream();
        JsonWriter writer = new JsonWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        writer.beginObject(); // main object
        writer.name("message");
        writer.value("Hi");
        writer.name("place"); // save object Place
        writer.beginObject();
        writer.name("name");
        writer.value("World!");
        writer.endObject();
        writer.endObject();
        writer.close();
        System.out.println(outputStream.toString()); // print "{"message":"Hi","place":{"name":"World!"}}"
    }
}
