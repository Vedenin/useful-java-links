package selma;

import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;

/**
 * Created by vedenin on 17.04.16.
 */
@Mapper(
        withCustomFields = {
                @Field({"message", "text"})
        }
)
public interface TestMapper {
    SelmaHelloWorld.Destination sourceToDestination(SelmaHelloWorld.Source source);
}
