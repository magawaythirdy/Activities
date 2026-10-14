package week.pkg5;

public class Basic {
    public static void main(String[] args) {
        String[] favorites = {"Basketball", "Music", "Coding", "Online Games", "Bonding with GF"};

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total length: " + favorites.length);
    }
}
