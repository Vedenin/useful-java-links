package ig_json_parser;

import com.instagram.common.json.annotation.JsonField;
import com.instagram.common.json.annotation.JsonType;

/**
 * Created by vedenin on 22.04.16.
 */
@JsonType
public class Place {
    @JsonField(fieldName="name")
    public String name;
}
