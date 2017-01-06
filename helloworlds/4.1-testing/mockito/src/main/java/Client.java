import java.util.ArrayList;
import java.util.List;

/**
 * Need for operations to buy.
 * Performs operations over balance.
 * If failed operations buy add {@link CodeError} in method {@link Client#addCodeError(CodeError)}.
 */
class Client {
    private int balance;
    private List<CodeError> codeErrors = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    Client(int balance) {
        this.balance = balance;
    }

    boolean haveAmountOnBalance(int amount) {
        return (balance >= amount);
    }

    int getBalance() {
        return balance;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void addCodeError(CodeError codeError) {
        codeErrors.add(codeError);
    }

    List<CodeError> getCodeErrors() {
        return codeErrors;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Client{" +
                "balance=" + balance +
                ", codeErrors=" + codeErrors +
                ", products=" + products +
                '}';
    }
}
