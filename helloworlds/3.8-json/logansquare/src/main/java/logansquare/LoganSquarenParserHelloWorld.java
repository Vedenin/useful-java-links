package logansquare;

import com.bluelinelabs.logansquare.LoganSquare;

/**
 *  Ig Json Parser Hello World
 *
  */
public class LoganSquarenParserHelloWorld {

    public static void main(String[] args) throws Exception {
        // init class
        Place place = new Place();
        place.name = "World";

        Human human = new Human();
        human.message = "Hi";
        human.place = place;

        // convert to json
        String jsonString = LoganSquare.serialize(human);
        System.out.println("json " + jsonString); //print "json {"place":{"name":"World"},"message":"Hi"}"

        // convert from json
        Human newHuman = LoganSquare.parse(jsonString, Human.class);
        newHuman.say(); // print "Hi , World!"
    }
}
