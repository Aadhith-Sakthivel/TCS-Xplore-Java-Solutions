import java.util.Scanner;
public class MyClass {
	public static void main(String[] args)
	{
		Scanner get = new Scanner(System.in);
		String str = get.nextLine();
		char answer = 'u';
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i) == 'a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
					str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				if(str.charAt(i)<a)
				{
					answer=str.charAt(i);
				}
			}
		}
		System.out.print(a);
		get.close();
	}
}


