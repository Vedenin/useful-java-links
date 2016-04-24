package fastjson;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPath;

/**
 *  Json Path Hello World
 *
  */
public class JsonPathHelloWorld {

    public  static void main(String[] args) {
        // init class
        Place place = new Place();
        place.setName("World");

        Human human = new Human();
        human.setMessage("Hi");
        human.setPlace(place);

        // convert to json and from json
        String jsonString = JSON.toJSONString(human);
        Human newHuman = JSON.parseObject(jsonString, Human.class);

        // use eval to get info
        Object message = JSONPath.eval(newHuman, "$.message");
        Object world = JSONPath.eval(newHuman, "$.place.name");
        System.out.println(message + " " + world); // print Hi World
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
