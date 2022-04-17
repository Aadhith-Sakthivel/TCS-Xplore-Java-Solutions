import java.util.*;
public class MyClass {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in); 
		int number = get.nextInt();
		int reverse = 0; 
		while(number != 0)
		{
			int remainder = number % 10;
			reverse = reverse * 10 + remainder; 
			number = number/10; 
			}
		System.out.println(reverse);
get.close();
	}

}
