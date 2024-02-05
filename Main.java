import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of video games
        List<VideoGame> videoGames = Arrays.asList(
                new VideoGame("The Legend of Zelda", "Action-Adventure", 1986),
                new VideoGame("Super Mario Bros.", "Platform", 1985),
                new VideoGame("Minecraft", "Sandbox", 2011)
        );

        // Print the information of each VideoGame object
        for (VideoGame game : videoGames) {
            System.out.println("\nVideo Game Information:\n" + game.toString());
        }

        // Create a shopping cart
        ShoppingCart shoppingCart = new ShoppingCart();

        // Add 3 video games to the shopping cart
        shoppingCart.addToCart(videoGames.get(0));
        shoppingCart.addToCart(videoGames.get(1));
        shoppingCart.addToCart(videoGames.get(2));

        // Calculate and print the total value of items in the shopping cart
        System.out.println("\nTotal Value of Items in the Shopping Cart: $" + shoppingCart.calculateTotalValue());

        // Print names, genres, and release years of items in the shopping cart
        System.out.println("\nNames of Items in the Shopping Cart: " + shoppingCart.getItemNames());
        System.out.println("Genres of Items in the Shopping Cart: " + shoppingCart.getItemGenres());
        System.out.println("Release Years of Items in the Shopping Cart: " + shoppingCart.getItemReleaseYears());
    }
}