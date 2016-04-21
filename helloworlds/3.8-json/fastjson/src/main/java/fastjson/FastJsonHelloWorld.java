package fastjson;

import com.alibaba.fastjson.JSON;

/**
 *  FastJson Hello World
 *
  */
public class FastJsonHelloWorld {
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

    public static void main(String[] args) {
        // init class
        World world = new World();
        world.setName("World");

        Human human = new Human();
        human.setMessage("Hi");
        human.setWorld(world);

        // convert to json
        String jsonString = JSON.toJSONString(human);
        System.out.println("json " + jsonString);

        // convert from json
        Human newHuman = JSON.parseObject(jsonString, Human.class);
        newHuman.say();
    }
}
