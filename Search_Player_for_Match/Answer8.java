import java.util.*;
public class MyClass
{
	public static void main(String[] args)
	{
		Scanner get = new Scanner(System.in);
		Player[] players = new Player[4];
		int id;
		String country;
		String side;
		double price;
		for(int i=0;i<4;i++)
		{
			id=get.nextInt();
			get.nextLine();
			country = get.nextLine();
			side = get.nextLine();
			price = get.nextDouble();
			players[i] = new Players(id,country,side,price);
		}
		get.nextLine();
		String search = get.nextLine();
		Player[] result = searchPlayerForMatch(search,players);
		Arrays.sort(result);
		for(Player p: result)
			System.out.println(p.getId());
		
		get.close();
	}

public static Player[] searchPlayerForMatch(String search, Player[] players)
{
//method logic
	Player[] temp = new Player[0];
	for(Player p : players)
	{
		if(p.getSide().toLowerCase().equals(search.toLowerCase()))
		{
			temp = Arrays.copyOf(temp, temp.length+1);
			temp[temp.length-1]=p;
		}
	}
	
	return temp;

}
}

class Player implements Comparable<Player>
{
	private int id;
	String country;
	String side;
	double price;
	public Player(int id, String country, String side, double price) {
		super();
		this.setId(id);
		this.country = country;
		this.side = side;
		this.price = price;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int compareTo(Player p) {
		
		return this.getId()-p.getId();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

