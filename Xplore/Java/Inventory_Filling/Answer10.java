import java.util.*;
public class MyClass
{
	public static void main(String[] args)
	{
	//code to read values
		Scanner get = new Scanner(System.in);
		Inventory[] inventory = new Inventory[4];
		
		int inventorId;
		int maximumQuantity;
		int currentQuantity;
		int threshold;
		
		for(int i =0; i<4; i++)
		{
			inventorId = get.nextInt();
			maximumQuantity = get.nextInt();
			currentQuantity = get.nextInt();
			threshold = get.nextInt();
			inventory[i] = new Inventory(inventorId, maximumQuantity, currentQuantity, threshold);
		}
		
		int limit = get.nextInt();
		
		
	//code to call required method
		Inventory[] ans = replenish(limit,inventory);
		
		
	//code to display the results
		for(Inventory s: ans)
		{
			if(s!=null)
				if(s.threshold>=75)
					System.out.println(s.inventorId+" Critical Filling");
				else if(s.threshold<75 && s.threshold<=50)
					System.out.println(s.inventorId+" Moderate Filling");
				else
			        System.out.println(s.inventorId+" Non-Critical Filling");
		}
		
		
		
		get.close();
	}

	public static Inventory[] replenish(int limit, Inventory[] inventory)
	{
	//method logic
		Inventory[] temp = new Inventory[inventory.length];
		int j=0;
		for(Inventory i:inventory)
		{
			if(i.threshold<=limit)
			{
				temp[j++]=i;
			}
		}
		return temp;

	}
	}

	
class Inventory
{
//code to build Inventory class
	
	int inventorId;
	int maximumQuantity;
	int currentQuantity;
	int threshold;
	public Inventory(int inventorId, int maximumQuantity, int currentQuantity, int threshold) {
		super();
		this.inventorId = inventorId;
		this.maximumQuantity = maximumQuantity;
		this.currentQuantity = currentQuantity;
		this.threshold = threshold;
	}
	
}


