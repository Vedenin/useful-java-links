package gson;

import com.google.gson.Gson;

/**
 *  Gson Hello World
 *
  */
public class GsonHelloWorld {

    public static void main(String[] args) {
        // init class
        Place place = new Place();
        place.setName("World");

        Human human = new Human();
        human.setMessage("Hi");
        human.setPlace(place);

        // convert to json
        Gson gson = new Gson();
        String jsonString = gson.toJson(human);
        System.out.println("json " + jsonString); // print "json {"message":"Hi","place":{"name":"World"}}"

        // convert from json
        Human newHuman = gson.fromJson(jsonString, Human.class);
        newHuman.say(); // print "Hi , World!"
    }

    private static class Human {
        private String message;
        private Place place;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Place getPlace() {
            return place;
        }

        public void setPlace(Place place) {
            this.place = place;
        }

        public void say() {
            System.out.println();
            System.out.println(getMessage() + " , " + getPlace().getName() + "!");
        }
    }

    private static class Place {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
