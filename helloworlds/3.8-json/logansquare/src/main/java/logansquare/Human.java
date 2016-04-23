package logansquare;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * Created by vedenin on 22.04.16.
 */
@JsonObject
public class Human {
    @JsonField(name="message")
    public String message;
    @JsonField(name="place")
    public Place place;



    public void say() {
        System.out.println();
        System.out.println(message + " , " + place.name + "!");
    }
}
