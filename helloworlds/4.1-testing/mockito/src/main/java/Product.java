/**
 * This thing which sells store.
 */
class Product {
    private final String name;
    private final int cost;

    Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    String getName() {
        return name;
    }

    int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
