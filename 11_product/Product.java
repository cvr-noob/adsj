public class Product {
    int id;
    String name;
    double price;
    String type;
    double rating;

    Product(int id, String name, double price, String type, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product(id=" + id +
                ", name='" + name +
                "', price=" + price +
                ", type='" + type +
                "', rating=" + rating + ')';
    }
}
