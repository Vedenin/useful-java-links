package logansquare;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * Created by vedenin on 22.04.16.
 */
@JsonObject
public class Place {
    @JsonField(name="name")
    public String name;
}
