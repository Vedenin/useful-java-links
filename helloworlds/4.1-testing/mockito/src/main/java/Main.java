

/**
 * This example to using Mockito for testing code. Example is in CashierTest.
 */
class Main {
    public static void main(String[] args) {
        sellMilkFailed();
    }

    /**
     * This example {@link Client} to buy {@link Product}
     */
    private static void sellMilk() {
        Product milk = new Product("Milk",150);
        Client client = new Client(300);
        Cashier cashier = new Cashier();

        System.out.println(client.getProducts()); //[]
        cashier.toSell(client,milk);
        System.out.println(client.getProducts()); //[Product{name='Milk', cost=150}]
    }

    /**
     * This example {@link Client} can't to buy {@link Product} because not enough funds balance.
     */
    private static void sellMilkFailed() {
        Product milk = new Product("Milk",150);
        Client client = new Client(100);
        Cashier cashier = new Cashier();

        System.out.println(client.getProducts()); //[]
        cashier.toSell(client,milk);
        System.out.println(client.getProducts()); //[]
        System.out.println(client.getCodeErrors()); //[NOT_ENOUGH_FUNDS_BALANCE]
    }
}
