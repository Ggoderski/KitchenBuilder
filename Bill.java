import java.util.ArrayList;


/***
 * Prints the bill with the chosen items, total length & price.
 * @author RoyRooseboom
 *
 */
public class Bill 
{
	private double totalCost;
	private int totalWidth;
	
	/***
	 * Creates the Bill, and prints it to the console.
	 * @param teBetalenKasten
	 */
	public void Bon(ArrayList<Kasten> teBetalenKasten)
	{
		System.out.println();
		System.out.println("U heeft de volgende items gekozen: ");
		
		for(Kasten s: teBetalenKasten)
		{
			System.out.println(s.getName());
			TotalCost(s.getPrice());
			TotalLength(s.getWidth());
		}
		
		System.out.println("====================================");
		
		System.out.printf("De totale breedte is: " + "%d" +"cm %n" , totalWidth);
		System.out.printf("Het totaal bedrag is: " + "€%.2f %n"  , totalCost);
		
		System.out.println("====================================");
		System.out.println();
		
	}
	
	private int TotalLength(int length)
	{
		return totalWidth += length;
	}
	
	private double TotalCost(int price)
	{
		return totalCost += price;
	}
}
