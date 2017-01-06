import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

/**
 * This example create Mock with use Annotation.
 */
@RunWith(MockitoJUnitRunner.class)
public class CreateMockWithAnnotation {

    private static int costMilk = 10;
    @Mock
    private Client client;
    @Mock
    private Product milk;

    @Before
    public void setUp() throws Exception {
        settingMockClient(true);
        settingMockMilk();
    }

    @Test
    public void test() throws Exception {
        System.out.println(client);
        System.out.println(milk);
    }

    @SuppressWarnings("SameParameterValue")
    private void settingMockClient(boolean haveAmountOnBalance) {
        when(client.haveAmountOnBalance(costMilk)).thenReturn(haveAmountOnBalance);
    }

    private void settingMockMilk() {
        when(milk.getName()).thenReturn("Milk");
        when(milk.getCost()).thenReturn(costMilk);
    }
}
