package MiniPeta3;

    import java.util.Scanner;

    public class RestaurantSearch {

        public void search(Scanner scanner) {

            String[] restaurants = {
                    "Jollibee",
                    "McDonald's",
                    "Mang Inasal",
                    "Chowking",
                    "Shakey's",
                    "Greenwich",
                    "Pizza Hut",
                    "KFC"
            };

            System.out.println();
            System.out.println("===== RESTAURANT SEARCH =====");
            System.out.print("Enter restaurant name: ");

            String search = scanner.nextLine().trim().toLowerCase();

            boolean found = false;

            for (String restaurant : restaurants) {

                if (restaurant.toLowerCase().contains(search)) {
                    System.out.println("Restaurant found: " + restaurant);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No restaurant found.");
            }

            System.out.println("==============================");
        }
}