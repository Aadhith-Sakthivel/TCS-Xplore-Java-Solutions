import java.util.*;
public class MyClass {
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
     //code to read values
        //code to call required method
           //code to display the result

        int rollNo;
        String name;
        String branch;
        double score;
        boolean dayScholar;

        Student[] students = new Student[4];

        for(int i=0; i<4; i++)
        {
            rollNo = get.nextInt();
            name=get.next();
            branch=get.next();
            score=get.nextDouble();
            dayScholar=get.nextBoolean();

            students[i]= new Student(rollNo,name, branch,score,dayScholar);

        }
        int ans1 = findCountOfDayscholarStudents(students);

        if(ans1==0)
            System.out.println("There are no such dayscholar students");
       
        else
            System.out.println(ans1);
        

        Student ans2= findStudentwithSecondHighestScore(students);
        
	if(ans2==null)
            System.out.println("There are no student from non day scholar");
        
        else
            System.out.println(ans2.getRollNo()+"#"+ans2.getName()+"#"+ans2.getScore());
        


        get.close();


    }
    public static int findCountOfDayscholarStudents(Student students[])
    {
        //method logic

        int count=0;
        for(int i=0;i<4;i++)
        {
            if(students[i].getScore()>80 && students[i].isDayScholar()==true)
            {
                count++;
            }
        }


        return count;

    }
    public static Student findStudentwithSecondHighestScore(Student students[]) {
      //method logic

        Student[] studs = new Student[0];
        for (Student i : students) {
            if (!(i.isDayScholar())) {
                studs = Arrays.copyOf(studs, studs.length + 1);
                studs[studs.length - 1] = i;
            }
        }
        if (studs.length == 0)
            return null;
        else {
            Arrays.sort(studs);
            return studs[studs.length - 2];
        }
    }
}
class Student implements Comparable<Student>
{
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;
    Student()  {}
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public boolean isDayScholar() {
        return dayScholar;
    }
    public void setDayScholar(boolean dayScholar) {
        this.dayScholar = dayScholar;
    }
    public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }



    @Override
    public int compareTo(Student o) {
        return (int)getScore()-(int) o.getScore();
    }


}
            
