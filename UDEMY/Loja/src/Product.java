public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueinStock(){
        return this.getPrice() * this.getQuantity();
    }
    public void addProducts(int valor){
        this.setQuantity(this.getQuantity() + valor);
    }
    public void removeProducts(int valor){
        this.setQuantity(this.getQuantity() - valor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product Data:" + "\n" +
                "Name: " + name + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + quantity + "\n" +
                "Total: " + totalValueinStock();
    }
}
