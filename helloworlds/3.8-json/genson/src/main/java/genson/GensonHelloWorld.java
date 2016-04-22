package genson;

import com.owlike.genson.Genson;

import java.io.IOException;

/**
 *  Genson Hello Place
 *
  */
public class GensonHelloWorld {

    public static void main(String[] args) throws IOException {
        // init class
        Place place = new Place();
        place.setName("World");

        Human human = new Human();
        human.setMessage("Hi");
        human.setPlace(place);

        // convert to json
        String jsonString = new Genson().serialize(human);

        System.out.println("json " + jsonString); //print "json {"message":"Hi","place":{"name":"World"}}"

        // convert from json
        Human newHuman =  new Genson().deserialize(jsonString, Human.class);
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

        public Human() {
        }

        public Human(String message, Place place) {
            this.message = message;
            this.place = place;
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

        public Place(String name) {
            this.name = name;
        }

        public Place() {
        }
    }
}
