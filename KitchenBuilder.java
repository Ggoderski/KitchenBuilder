import java.util.ArrayList;
import java.util.Scanner;

public class KitchenBuilder {
    private static Scanner sc = new Scanner(System.in);
    private static Kasten[] beschikbareKasten = new Kasten[] {
        new Kasten("Hogekast met koelkast", 60, 1000),
        new Kasten("Hogekast met oven", 60, 850),
        new Kasten("Hogekast voor voorraad", 60, 500),
        new Kasten("Kookkast", 60, 500),
        new Kasten("Kookkast", 80, 550),
        new Kasten("Spoelkast", 60, 200),
        new Kasten("Spoelkast", 80, 250),
        new Kasten("Kast met lades", 40, 200),
        new Kasten("Kast met lades", 60, 300),
        new Kasten("Kast met lades", 80, 400)
    };
    private ArrayList<Kasten> gekozenKasten = new ArrayList<>();

    public void addKasten() {
        int keuze = 1;

        while (keuze != 0) {
            displayMenu();
            keuze = sc.nextInt();

            if (keuze > 0 && keuze <= beschikbareKasten.length) {
                gekozenKasten.add(beschikbareKasten[keuze - 1]);
            }
        }
    }

    private void displayMenu() {
        System.out.println("");
    	System.out.println("Dit zijn alle kasten die wij in assortiment hebben:");
    	System.out.println("|");

        for (int i = 0; i < beschikbareKasten.length; i++) {
            System.out.println((i + 1) + ". " + beschikbareKasten[i].getName()+ " (" + beschikbareKasten[i].getWidth() + "cm)");
        }

        System.out.println("0. Je wilt afrekenen");
        System.out.println("|");
        System.out.println("Maak je keuze!");
        System.out.println("");
        System.out.println("Je hebt tot nu toe de volgende kasten gekozen:");
        for (int i = 0; i < gekozenKasten.size(); i++) {
          System.out.println(gekozenKasten.get(i).getName());
        }
        
    }
    
    
    
    
    
}
	    

