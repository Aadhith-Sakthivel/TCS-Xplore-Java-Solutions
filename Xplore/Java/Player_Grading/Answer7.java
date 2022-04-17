import java.util.*;

public class MyClass 
{
	public static void main(String[] args)
	{
		int id;
		String name;
		int iccrank;
		int noOfMatches;
		int totalRunsScored;
		
		Players[] player = new Players[4];
		
		Scanner get = new Scanner(System.in);
		
		for(int i=0; i<4; i++)
		{
			id = get.nextInt();
			name = get.next();
			iccrank = get.nextInt();
			noOfMatches = get.nextInt();
			totalRunsScored = get.nextInt();
			
			player[i] = new Players(id,name,iccrank,noOfMatches,totalRunsScored);
		}
		int target = get.nextInt();
		double[] answer = findAverageScoreOfPlayers(player,target);
		
		for(double i: answer)
		{
			if(i>=80)
			{
				System.out.println("Grade A Player");
			}
			else if(i>=50 && i<=79)
			{
				System.out.println("Grade B Player");
			}
			else if(i>0 && i<=49)
			{
				System.out.println("Grade C Player");
			}
		}

		
		
		get.close();
	}
	
	public static double[] findAverageScoreOfPlayers(Players[] player,int totalMatches)
	 {
	  //method logic
	  
		 double [] temp = new double[0];
		 
		 for (int i=0; i<4; i++)
		 {
			 if(player[i].noOfMatches>=totalMatches)
			 {
				 double avg = player[i].totalRunsScored/player[i].noOfMatches;
				 temp = Arrays.copyOf(temp, temp.length+1);
				 temp[temp.length-1]=avg;
			 }
		 }
		
		 return temp;
	 }

}

class Players
{
	int id;
	String name;
	int iccrank;
	int noOfMatches;
	int totalRunsScored;
	public Players(int id, String name, int iccrank, int noOfMatches, int totalRunsScored) {
		super();
		this.id = id;
		this.name = name;
		this.iccrank = iccrank;
		this.noOfMatches = noOfMatches;
		this.totalRunsScored = totalRunsScored;
	}
	
}
