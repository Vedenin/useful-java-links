/**
 * Calculate end cost on {@link Product}.
 * Performs operations with {@link Product} and {@link Client}.
 */
class Cashier {
    /**
     * Performs sale {@link Product}.
     * If {@link Client} cant buy {@link Product} report error in {@link Client}.
     *
     * @param client {@link Client} who want buy {@link Product}.
     * @param product {@link Product} which want buy {@link Client}.
     */
     void toSell(Client client, Product product) {
        int cost = product.getCost();
        if (checkBalanceClient(client, cost)) {
            client.withdraw(cost);
            client.addProduct(product);
        } else {
            client.addCodeError(CodeError.NOT_ENOUGH_FUNDS_BALANCE);
            System.out.println("toSell: Failed NOT_ENOUGH_FUNDS_BALANCE");
        }
    }

    /**
     * Check paying capacity {@link Client}.
     *
     * @return false if {@link Client} cant buy {@link Product}.
     */
    private boolean checkBalanceClient(Client client, int cost) {
        return client.haveAmountOnBalance(cost);
    }

}
