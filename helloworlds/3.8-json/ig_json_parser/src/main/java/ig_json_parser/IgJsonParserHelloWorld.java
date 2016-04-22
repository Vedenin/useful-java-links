package ig_json_parser;

import com.instagram.common.json.annotation.JsonField;
import com.instagram.common.json.annotation.JsonType;

/**
 *  Ig Json Parser Hello World
 *
  */
public class IgJsonParserHelloWorld {

    public static void main(String[] args) throws Exception {
        // init class
        Place place = new Place();
        place.name = "World";

        Human human = new Human();
        human.message = "Hi";
        human.place = place;

        // convert to json
        String jsonString = Human__JsonHelper.serializeToJson(human);
        System.out.println("json " + jsonString); //print "json {"place":{"name":"World"},"message":"Hi"}"

        // convert from json
        Human newHuman = Human__JsonHelper.parseFromJson(jsonString);
        newHuman.say(); // print "Hi , World!"
    }
}
