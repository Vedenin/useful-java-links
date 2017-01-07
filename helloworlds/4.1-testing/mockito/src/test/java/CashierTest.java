import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * This example about how to test method call using Mockito.
 */
public class CashierTest {

    private final static int costMilk = 50;
    private Cashier cashier = new Cashier();
    /**
     * Here we create Mock for testing.
     * We test Cashier not Product and Client. That is why we will replace them on Mock.
     * For create Mock I use my method {@link CashierTest#createMockMilk()}
     * and {@link CashierTest#createMockClient(boolean)}.
     * You can create Mock with use Annotation {@link org.mockito.Mock}. Example this {@link CreateMockWithAnnotation}.
     */
    private Product milk = createMockMilk();
    private Client client = createMockClient(true);

    private static Product createMockMilk() {
        //So we get mock.
        Product milk = mock(Product.class);
        //Next, setting mock.
        //Here we say when the milk will call getName() then return "Milk".
        when(milk.getName()).thenReturn("Milk");
        //Here we say when the milk will call getCost() then return value is costMilk.
        when(milk.getCost()).thenReturn(costMilk);
        return milk;
    }

    private static Client createMockClient(boolean haveAmountOnBalance) {
        Client client = mock(Client.class);
        /*
        Here we say when the client will call haveAmountOnBalance()
        whit param value is costMilk then return value is haveAmountOnBalance.
         */
        when(client.haveAmountOnBalance(costMilk)).thenReturn(haveAmountOnBalance);
        return client;
    }

    /**
     * Here we to test methods call for {@link Client}.
     */
    @Test
    public void testToSellCallMethodInClient() throws Exception {
        cashier.toSell(client, milk);

        /*
        Next, we check call methods in client.
        Here we say check call method in client haveAmountOnBalance() whit param value is costMilk.
        If method not call or call two or more times, test failed.
        */
        verify(client).haveAmountOnBalance(costMilk);
        verify(client).withdraw(costMilk);
        verify(client).addProduct(milk);
    }

    /**
     * This we test method {@link Product#getCost()} to call only.
     */
    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    public void testToSellCallMethodInProduct() throws Exception {
        cashier.toSell(client, milk);
        /*
        Also we cen check how many times use method.
        Here we say milk most call only one method getCost(). Otherwise test failed.
         */
        verify(milk, only()).getCost();
    }

    /**
     * Here we test behavior if not enough funds balance.
     */
    @Test
    public void ifNotEnoughFundsBalance() throws Exception {
        Client clientPoor = createMockClient(false);
        cashier.toSell(clientPoor, milk);

        verify(clientPoor).haveAmountOnBalance(costMilk);
        verify(clientPoor).addCodeError(CodeError.NOT_ENOUGH_FUNDS_BALANCE);

        verify(client, never()).withdraw(costMilk);
        verify(client, never()).addProduct(milk);
    }
}