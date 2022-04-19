import java.util.*;
public class MyClass
    {
        public static void main (String[]args)
        {
          //code to read values
            Scanner get = new Scanner(System.in);
            int billNo;
            String name;
            String typeOfconnection;
            double billAmount;
            boolean status;
            int n = get.nextInt();
            Bill[] bills = new Bill[n];
            for (int i=0; i<n;i++) {
                billNo = get.nextInt();
                get.nextLine();
                name = get.nextLine();
                typeOfconnection = get.nextLine();
                billAmount = get.nextDouble();
                status = get.nextBoolean();
                bills[i] = new Bill(billNo,name,typeOfconnection,billAmount,status);
            }
            boolean findbool =get.nextBoolean();
            get.nextLine();
            String search = get.nextLine();

           Bill[] ans = findBillWithMaxBillAmountBasedOnStatus(findbool,bills);
           int ans1 = getCountWithTypeOfConnection(search,bills);
           
            if (ans!=null)
            	
            {
            	for (int i=0;i<ans.length;i++)
                {
                    if (i== ans.length-1)
                    {
                        System.out.println(ans[i].getBillNo()+"#"+ans[i].getName());
                    }
                }
            }
                
            else
            	System.out.println("There are no bill with the given status");
            
            
            if (ans1==0)
                System.out.println("There are no bills with given type of connection");
            
            else
                System.out.println(ans1);
        

              
      get.close();

}

        public static Bill[] findBillWithMaxBillAmountBasedOnStatus ( boolean findbool, Bill[] bills) 
	{
          //method logic
            Bill[] result = new Bill[0];

            for (Bill b:bills)
            {
                if (b.isStatus() == findbool) {
                        result = Arrays.copyOf(result, result.length + 1);
                        result[result.length-1] = b;
                    }

            }
            Arrays.sort(result);
            if(result.length==0)
            	return null;
            else
                return result;

    }
        public static int getCountWithTypeOfConnection (String search, Bill[] bills) {
         //method logic
            int count=0;
            for (Bill b: bills)
            {
                if (b.getTypeOfconnection().toLowerCase().equals(search.toLowerCase()))
                {
                    count++;
                }
            }
            return count;
    }
  }

    class Bill implements Comparable<Bill> {
        private int billNo;
        private String name;
        private String typeOfconnection;
        private double billAmount;
        private boolean status;

        public int getBillNo() {
            return billNo;
        }

        public void setBillNo(int billNo) {
            this.billNo = billNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTypeOfconnection() {
            return typeOfconnection;
        }

        public void setTypeOfconnection(String typeOfconnection) {
            this.typeOfconnection = typeOfconnection;
        }

        public double getBillAmount() {
            return billAmount;
        }

        public void setBillAmount(double billAmount) {
            this.billAmount = billAmount;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public Bill() {
        }

        public Bill(int billNo, String name, String typeOfconnection, double billAmount, boolean status) {
            this.billNo=billNo;
            this.name=name;
            this.typeOfconnection=typeOfconnection;
            this.billAmount=billAmount;
            this.status=status;

        }

        @Override
        public int compareTo(Bill o) {
            return (int)this.billAmount-(int)o.billAmount;
        }
    }

