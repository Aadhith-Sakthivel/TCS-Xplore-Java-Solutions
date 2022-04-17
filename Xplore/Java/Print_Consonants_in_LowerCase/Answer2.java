import java.util.*; 
public class MyClass 
{
 public static void main(String[] args) 
 { 
   Scanner get = new Scanner(System.in); 
   String s = get.nextLine(); 
   String s1 = ""; 
   s1 = s.replaceAll("[AEIOUaeiou]", ""); 
   s1=s1.toLowerCase(); 
   System.out.println(s1); 
  get.close();
  }
}
