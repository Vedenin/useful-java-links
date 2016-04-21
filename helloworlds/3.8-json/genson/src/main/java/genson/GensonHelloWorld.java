package genson;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;

/**
 *  Genson Hello World
 *
  */
public class GensonHelloWorld {

    public static void main(String[] args) throws IOException {
        // init class
        World world = new World();
        world.setName("World");

        Human human = new Human();
        human.setMessage("Hi");
        human.setWorld(world);

        // convert to json
        Moshi moshi = new Moshi.Builder().build();
        JsonAdapter<Human> jsonAdapter = moshi.adapter(Human.class);

        String jsonString = jsonAdapter.toJson(human);
        System.out.println("json " + jsonString);

        // convert from json
        Human newHuman = jsonAdapter.fromJson(jsonString);
        newHuman.say();
    }

    private static class Human {
        private String message;
        private World world;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public World getWorld() {
            return world;
        }

        public void setWorld(World world) {
            this.world = world;
        }

        public void say() {
            System.out.println();
            System.out.println(getMessage() + " , " + getWorld().getName() + "!");
        }
    }

    private static class World {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
