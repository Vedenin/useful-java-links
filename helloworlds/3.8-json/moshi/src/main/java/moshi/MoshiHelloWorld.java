package moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;

/**
 *  Moshi Hello World
 *
  */
public class MoshiHelloWorld {
    public static void main(String[] args) throws IOException {
        // init class
        Place place = new Place();
        place.setName("World");

        Human human = new Human();
        human.setMessage("Hi");
        human.setPlace(place);

        // convert to json
        Moshi moshi = new Moshi.Builder().build();
        JsonAdapter<Human> jsonAdapter = moshi.adapter(Human.class);

        String jsonString = jsonAdapter.toJson(human);
        System.out.println("json " + jsonString); //print "json {"message":"Hi","place":{"name":"World"}}"

        // convert from json
        Human newHuman = jsonAdapter.fromJson(jsonString);
        newHuman.say(); // print "Hi , World!"
    }

    private static class Human {
        private String message;
        private Place place;

        String getMessage() {
            return message;
        }

        void setMessage(String message) {
            this.message = message;
        }

        Place getPlace() {
            return place;
        }

        void setPlace(Place place) {
            this.place = place;
        }

        void say() {
            System.out.println();
            System.out.println(getMessage() + " , " + getPlace().getName() + "!");
        }
    }

    private static class Place {
        private String name;

        String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }
    }

}
