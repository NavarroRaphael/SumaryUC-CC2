// Custom Exception for Invalid Quantity
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

// Shopping Cart Class
class ShoppingCart {
    private int stock;

    public ShoppingCart(int stock) {
        this.stock = stock;
    }

    // Method to check if the quantity is valid
    public void addItem(int quantity) throws InvalidQuantityException {
        if (quantity < 0) {
            throw new InvalidQuantityException("Quantity cannot be negative.");
        }
        if (quantity > stock) {
            throw new InvalidQuantityException("Not enough stock. Available: " + stock);
        }
        System.out.println("Added " + quantity + " items to your cart.");
    }
}

// Main Class
public class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(10); // 10 items in stock

        try {
            // Trying to add an invalid quantity (negative)
            cart.addItem(-2);
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Trying to add more items than available stock
            cart.addItem(15);
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Adding a valid quantity
            cart.addItem(5);
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
    }
}