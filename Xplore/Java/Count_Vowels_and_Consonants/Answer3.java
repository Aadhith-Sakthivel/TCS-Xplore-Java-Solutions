import java.util.*;
public class MyClass {
      public static void main(String[] args)
      {
    	  Scanner get = new Scanner(System.in);
    	  int n = get.nextInt();
    	  List<Double> lst= new ArrayList<Double>();
    	  for(int i = 0; i<n; i++)
    	  {
    		  double x = get.nextDouble();
    		 
    		  lst.add(x);
    	  }
    	  
    	  
    	 List <Double> ans1 = findValidScore(lst);
    	 
    	 List <Integer> fynl = validateScore(ans1);
    	 
    
    
    	  if(fynl.isEmpty())
    		  System.out.print("No valid Scores");
    		  
    	  else
    		  System.out.print("Valid Scores = "+fynl);
    	  
    	  get.close();
      }
      
	public static List<Double> findValidScore(List<Double> lst)
      
	  {
    	  List <Double> temp =  new ArrayList<Double>();
    	  for(int i=0; i<lst.size();i++)
    	  {
    		  if(lst.get(i)>0 && lst.get(i)<=100)
    		  {
    			  temp.add(lst.get(i));
    		  }
    	  }
		return temp;
		  
	  }
	private static List<Integer> validateScore(List<Double> ans1) {
		List <Integer> temp = new ArrayList<Integer>();
		 for(int i=0; i<ans1.size();i++)
			 
   	  {
			 
   		  if(ans1.get(i)==ans1.get(i).intValue())
   		  {
   			  int x = ans1.get(i).intValue();
   			  temp.add(x);
   		  }
   	  }
		return temp;
	}
}

