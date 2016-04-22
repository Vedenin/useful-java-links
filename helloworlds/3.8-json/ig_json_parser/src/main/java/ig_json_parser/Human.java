package ig_json_parser;

import com.instagram.common.json.annotation.JsonField;
import com.instagram.common.json.annotation.JsonType;

/**
 * Created by vedenin on 22.04.16.
 */
@JsonType
public class Human {
    @JsonField(fieldName="message")
    public String message;
    @JsonField(fieldName="place")
    public Place place;



    public void say() {
        System.out.println();
        System.out.println(message + " , " + place.name + "!");
    }
}
