import java.util.*;
public class MyClass 
{
    public static void main(String[] args) 
    {    
	    Scanner get = new Scanner(System.in);
            String str = get.nextLine();

            int vCount = 0, cCount = 0;    
            str = str.toLowerCase();    

            for(int i = 0; i < str.length(); i++) 
            {    
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
                {    
                    vCount++;    
                }    

                else if(str.charAt(i) > 'a' && str.charAt(i)<='z') 
                {      

                    cCount++;    
                }    
            }    
            System.out.println("Number of Vowels:" + vCount);    
            System.out.println("Number of Consonants:" + cCount);  
       get.close();
    }       
}
