public class Q4_OutOfStockHandling {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 10, 55000.0);

        try {
            laptop.purchase(12);
            System.out.println("Purchase successful.");
        } catch (OutOfStockException e) {
            System.out.println("Purchase failed: " + e.getMessage());
        }

        try {
            laptop.purchase(3);
            System.out.println("Purchase successful. Remaining stock: " + laptop.getStock());
        } catch (OutOfStockException e) {
            System.out.println("Purchase failed: " + e.getMessage());
        }
    }
}

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class Product {
    private final String name;
    private int stock;
    private final double price;

    public Product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public void purchase(int quantity) throws OutOfStockException {
        if (quantity <= 0) throw new OutOfStockException("Quantity must be positive.");
        if (quantity > stock) throw new OutOfStockException("Requested " + quantity + " but only " + stock + " in stock for " + name + ".");
        stock -= quantity;
    }

    public int getStock() {
        return stock;
    }
}

