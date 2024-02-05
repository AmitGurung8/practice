import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    // List to store VideoGame objects in the shopping cart
    private List<VideoGame> cartItems;

    // Constructor to initialize the shopping cart
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add a VideoGame object to the shopping cart
    public void addToCart(VideoGame game) {
        cartItems.add(game);
    }

    // Method to calculate the total value of items in the shopping cart
    public double calculateTotalValue() {
        double totalValue = 0.0;
        for (VideoGame game : cartItems) {
            totalValue += 50.0; // Assuming each game has a fixed value of $50
        }
        return totalValue;
    }

    // Method to get the names of items in the shopping cart
    public List<String> getItemNames() {
        List<String> itemNames = new ArrayList<>();
        for (VideoGame game : cartItems) {
            itemNames.add(game.getTitle());
        }
        return itemNames;
    }

    // Method to get the genres of items in the shopping cart
    public List<String> getItemGenres() {
        List<String> itemGenres = new ArrayList<>();
        for (VideoGame game : cartItems) {
            itemGenres.add(game.getGenre());
        }
        return itemGenres;
    }
















    

    // Method to get the release years of items in the shopping cart
    public List<Integer> getItemReleaseYears() {
        List<Integer> itemReleaseYears = new ArrayList<>();
        for (VideoGame game : cartItems) {
            itemReleaseYears.add(game.getReleaseYear());
        }
        return itemReleaseYears;
    }
}