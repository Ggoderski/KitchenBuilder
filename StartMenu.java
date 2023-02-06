import java.util.Scanner;
public class StartMenu {

	private static Scanner sc = new Scanner(System.in);
    private static KitchenBuilder kitchenBuilder = new KitchenBuilder();

    public static void main(String[] args) {
        System.out.println("Welcome to KingGiddie's Kitchen Builder");
        int choice = -1;

        while (choice != 0) {
            System.out.println("Kies 1 om je keuken te bouwen");
            System.out.println("Kies 0 om te stoppen");
            choice = sc.nextInt();

            if (choice == 1) {
                kitchenBuilder.addKasten();
            } else {
            	System.out.println("");
            	System.out.println("Tot de volgende keer!");
              }
        }
    }
}
