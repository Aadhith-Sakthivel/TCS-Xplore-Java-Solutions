import java.util.Collections;
import java.util.*;
public class MyClass 
{
       public static void main(String[] args) 
       {

            Sim[] cards = new Sim[5];

            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 5; i++) 
	    {
                int simId = sc.nextInt();
                sc.nextLine();
                String customerName = sc.nextLine();
                double balance = sc.nextDouble();
                double ratePerSecond = sc.nextDouble();
                sc.nextLine();
                String circle = sc.nextLine();

                cards[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
            }

            String circle1 = sc.nextLine();
            String circle2 = sc.nextLine();

            Sim[] result = transferCustomerCircle(cards, circle1, circle2);

            for (Sim s : result)
                System.out.println(s.getSimId() + " " + s.getCustomerName() + " "
                        + s.getCircle() + " " + s.getRatePerSecond());

            sc.close();
        }

        public static Sim[] transferCustomerCircle(Sim[] sim, String circle1, String circle2) 
	{
            Sim[] refined = new Sim[0];
            for (int i = 0; i < 5; i++) 
	    {
                if (sim[i].getCircle().equalsIgnoreCase(circle1)) 
		{
                    refined = Arrays.copyOf(refined, refined.length + 1);
                    refined[refined.length - 1] = sim[i];
                    refined[refined.length - 1].setCircle(circle2);
                }
            }

            Arrays.sort(refined, Collections.reverseOrder());
            return refined;
        }
    }


    class Sim implements Comparable<Sim>
    {
        //code to build Sim class

        int simId;
        String customerName;
        double balance;
        double ratePerSecond;
        String circle;

        


        public int getSimId() {
            return simId;
        }


        public void setSimId(int simId) {
            this.simId = simId;
        }


        public String getCustomerName() {
            return customerName;
        }


        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }


        public double getBalance() {
            return balance;
        }


        public void setBalance(double balance) {
            this.balance = balance;
        }


        public double getRatePerSecond() {
            return ratePerSecond;
        }


        public void setRatePerSecond(double ratePerSecond) {
            this.ratePerSecond = ratePerSecond;
        }


        public String getCircle() {
            return circle;
        }


        public void setCircle(String circle) {
            this.circle = circle;
        }


        public Sim(){}

        public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
            super();
            this.simId = simId;
            this.customerName = customerName;
            this.balance = balance;
            this.ratePerSecond = ratePerSecond;
            this.circle = circle;
        }


		@Override
		public int compareTo(Sim o) {
			return Double.compare(this.ratePerSecond,o.ratePerSecond);
	}
    }
            
