class Product {
    private int stock = 20;

    public void decreaseStock(String workerName, int quantity) {
        System.out.println(workerName + " is trying to decrease stock by " + quantity);
        synchronized (this) {
            if (stock >= quantity) {
                System.out.println(workerName + " decreased stock by " + quantity);
                stock -= quantity;
                System.out.println("Current stock: " + stock);
            } else {
                System.out.println(workerName + ": Sorry, not enough stock available.");
            }
        }
    }
}

class Worker extends Thread {
    private Product product;
    private String workerName;
    private int quantity;

    public Worker(Product product, String workerName, int quantity) {
        this.product = product;
        this.workerName = workerName;
        this.quantity = quantity;
    }

    public void run() {
        product.decreaseStock(workerName, quantity);
    }
}

public class Question8 {
    public static void main(String[] args) {
        Product product = new Product();

        Worker worker1 = new Worker(product, "Worker 1", 10);
        Worker worker2 = new Worker(product, "Worker 2", 8);
        Worker worker3 = new Worker(product, "Worker 3", 5);

        worker1.start();
        worker2.start();
        worker3.start();
    }
}
