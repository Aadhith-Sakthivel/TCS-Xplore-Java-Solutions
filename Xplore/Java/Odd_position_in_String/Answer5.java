import java.util.*;
public class  MyClass{
	public static void main(String[] args)
	{
		Scanner get = new Scanner(System.in);
		String str=get.nextLine();
		String answer="";
		for(int i=0; i<str.length();i++)
		{
			if(i%2==0)
			{
				answer = answer+str.charAt(i);
			}
		}
		System.out.println(answer);
		get.close();
	}
}
