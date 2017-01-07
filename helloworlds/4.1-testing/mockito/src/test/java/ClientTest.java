import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ClientTest {

    private Client client = new Client(100);

    @Test
    public void testGetBalance() throws Exception {
        assertThat(client.getBalance(),is(100));
    }

    @Test
    public void testHaveAmountOnBalance() throws Exception {
        assertFalse(client.haveAmountOnBalance(101));
        assertTrue(client.haveAmountOnBalance(100));
        assertTrue(client.haveAmountOnBalance(99));
    }

    @Test
    public void testWithdraw() throws Exception {
        client.withdraw(30);
        assertThat(client.getBalance(),is(70));
    }

    @Test
    public void testAddCodeError() throws Exception {
        final CodeError error = CodeError.NOT_ENOUGH_FUNDS_BALANCE;
        client.addCodeError(error);
        List<CodeError> codeErrors = client.getCodeErrors();
        assertThat(codeErrors.size(),is(1));
        assertThat(codeErrors.get(0),is(error));
    }

    @Test
    public void testAddProduct() throws Exception {
        Product milk = new Product("Milk", 50);
        client.addProduct(milk);
        List<Product> products = client.getProducts();
        assertThat(products.size(),is(1));
        assertThat(products.get(0),is(milk));
    }
}