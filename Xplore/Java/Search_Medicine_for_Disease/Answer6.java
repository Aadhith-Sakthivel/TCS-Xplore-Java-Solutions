import java.util.Arrays;
import java.util.Scanner;

public class MyClass 
{
	public static void main(String[] args) {
		Medicine[] medicine = new Medicine[4];
		String search;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < medicine.length; i++)
		{
		String medicineName = sc.nextLine();
		String batchNo = sc.nextLine();
		String disease = sc.nextLine();
		int price = sc.nextInt();
		sc.nextLine();
		medicine[i] = new Medicine(medicineName, batchNo, disease, price);
        }
		search = sc.nextLine();
		Integer[] price = medicinePriceForGivenDisease(medicine, search);

		for(int i=0;i<price.length;i++) {
		System.out.println(price[i]);
		}
      }
    public static Integer[] medicinePriceForGivenDisease(Medicine[] medicine,String disease)
  {
    //method logic
	Integer[] answer = new Integer[0];
	for(Medicine m : medicine)
	{
		if(m.disease.toLowerCase().equals(disease.toLowerCase()))
		{
			answer=Arrays.copyOf(answer, answer.length+1);
			answer[answer.length-1]=m.price;
		}
	}
    //code to find price, sort and return the sorted array.
    Arrays.sort(answer);
    return answer;
  }
}

class Medicine implements Comparable<Medicine>
{
	String medicineName;
	String batchNo;
	String disease;
	int price;
	public Medicine(String medicineName, String batchNo, String disease, int price) {
		super();
		this.medicineName = medicineName;
		this.batchNo = batchNo;
		this.disease = disease;
		this.price = price;
	}
	@Override
	public int compareTo(Medicine o) {
		// TODO Auto-generated method stub
		return this.price-o.price;
	}
	
}                         
